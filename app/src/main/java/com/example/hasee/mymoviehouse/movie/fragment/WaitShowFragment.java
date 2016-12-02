package com.example.hasee.mymoviehouse.movie.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;
import com.example.hasee.mymoviehouse.movie.adapter.WaitShowRecycleAdapter;
import com.example.hasee.mymoviehouse.movie.bean.RecycleViewBean;
import com.example.hasee.mymoviehouse.movie.bean.ScrollViewBean1;
import com.example.hasee.mymoviehouse.movie.bean.ScrollViewBean2;
import com.example.hasee.mymoviehouse.utils.Contacts;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * Created by lzq on 2016/11/30.
 */
public class WaitShowFragment extends Basefragment {
    String scrollView2Url = Contacts.WAIT_SHOW_SCROLLVIEW2;
    String receycleViewUrl = Contacts.WAIT_SHOW_RECEYCLE_VIEW;
    String scrollView1Url = Contacts.WAIT_SHOW_SCROLLVIEW1;
    private List<ScrollViewBean2.DataBean.ComingBean> scrollComingBeans;
    private List<RecycleViewBean.DataBean.ComingBean> recycleComingBeans;
    private List<ScrollViewBean1.DataBean> scrollDataBeens;
    private RecyclerView recyclerView;
    private WaitShowRecycleAdapter adapter;
    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.wait_show,null);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_wait_show);

        return view;
    }

    @Override
    protected String getUrl() {
        return scrollView2Url;
    }

    @Override
    protected void getProgressData(String response) {


        ScrollViewBean2 scrollViewBean2 = new Gson().fromJson(response,ScrollViewBean2.class);
        scrollComingBeans = scrollViewBean2.getData().getComing();
        Log.e("qq", "q"+scrollComingBeans.size());
        getRecycleFromNet(receycleViewUrl);

    }

    @Override
    protected void initData() {



    }

    private void getRecycleFromNet(String receycleViewUrl) {

        OkHttpUtils
                .get()
                .url(receycleViewUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        progressRecycleData(response);
                    }
                });
    }

    private void progressRecycleData(String response) {
        RecycleViewBean recycleViewBean = new Gson().fromJson(response,RecycleViewBean.class);
        recycleComingBeans = recycleViewBean.getData().getComing();

        getScroll1FromNet(scrollView1Url);

    }

    private void getScroll1FromNet(String scrollView1Url) {
        OkHttpUtils
                .get()
                .url(scrollView1Url)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        progressScrollData(response);
                    }
                });
    }

    private void progressScrollData(String response) {
        ScrollViewBean1 scrollViewBean1  = new Gson().fromJson(response,ScrollViewBean1.class);
        scrollDataBeens = scrollViewBean1.getData();

        adapter = new WaitShowRecycleAdapter(mContext,recycleComingBeans,scrollComingBeans,scrollDataBeens);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(mContext);

        recyclerView.setLayoutManager(manager);
    }


}
