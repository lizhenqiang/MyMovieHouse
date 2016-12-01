package com.example.hasee.mymoviehouse.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.utils.UIUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

/**
 * Created by lzq on 2016/11/30.
 */
public abstract class LoadingPage extends FrameLayout {

    private TextView errorTv;
    private ImageView backgroud_logo01;

    //1.提供联网操作的4种状态
    private final int STATE_LOADING = 1;//加载状态
    private final int STATE_ERROR = 2;//联网失败的状态
    private final int STATE_EMPTY = 3;//联网成功，但是返回数据为空的状态
    private final int STATE_SUCCESS = 4;//联网成功，且正确返回数据的状态

    private int state_current = STATE_LOADING;//表示当前的状态


    //2.提供4个不同的页面
    private View view_loading;
    private View view_error;
    private View view_empty;
    private View view_success;

    public LoadingPage(Context context) {
        this(context, null);
    }

    public LoadingPage(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingPage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    private void init() {
        //初始化必要的View
        if (view_loading == null) {
            view_loading = UIUtils.getView(R.layout.page_loading);
            backgroud_logo01 = (ImageView) view_loading.findViewById(R.id.backgroud_logo01);
            initAnimation();
            addView(view_loading);
        }
        if (view_error == null) {
            view_error = UIUtils.getView(R.layout.page_error);

            addView(view_error);
        }
        if (view_empty == null) {
            view_empty = UIUtils.getView(R.layout.page_empty);
            addView(view_empty);
        }

        errorTv = (TextView) view_error.findViewById(R.id.error_tv);
        errorTv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "shuaxinle");
                getDataFromNet();
            }
        });
        //根据state_current的值，决定显示哪个具体的View
        showPage();

    }

    private void initAnimation(){


        Animation animaiton = AnimationUtils.loadAnimation(getContext(),R.anim.tip);
        backgroud_logo01.setAnimation(animaiton);
    }


    private void showPage() {
        view_loading.setVisibility(state_current == STATE_LOADING ? VISIBLE : GONE);
        view_empty.setVisibility(state_current == STATE_EMPTY ? VISIBLE : GONE);
        view_error.setVisibility(state_current == STATE_ERROR ? VISIBLE : GONE);


        if (view_success == null) {
            Log.e("AAA", "讲道理这个位置执行了");
            //view_success = UIUtils.getView(layoutId());
            view_success = getView();
            addView(view_success);
        }
        view_success.setVisibility(state_current == STATE_SUCCESS ? VISIBLE : GONE);
    }



    protected abstract View getView();


    public void getDataFromNet() {
        String url = url();
        if (TextUtils.isEmpty(url)) {
            state_current = STATE_SUCCESS;
            showPage();
            return;

        }
        OkHttpUtils
                .get()
                .url(url)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        state_current = STATE_ERROR;
                        showPage();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        state_current = STATE_SUCCESS;
                        showPage();

                        progressData(response);

                    }
                });


    }

    protected abstract String url();

    protected abstract void progressData(String response);
}
