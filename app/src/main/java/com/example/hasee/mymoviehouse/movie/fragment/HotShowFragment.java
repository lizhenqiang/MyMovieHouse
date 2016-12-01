package com.example.hasee.mymoviehouse.movie.fragment;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;
import com.example.hasee.mymoviehouse.movie.adapter.HotShowListViewAdapter;
import com.example.hasee.mymoviehouse.movie.bean.ListViewBean;
import com.example.hasee.mymoviehouse.movie.bean.ViewPagerBean;
import com.example.hasee.mymoviehouse.utils.Contacts;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.handmark.pulltorefresh.library.extras.SoundPullEventListener;
import com.squareup.picasso.Picasso;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.loader.ImageLoader;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by lzq on 2016/11/30.
 */
public class HotShowFragment extends Basefragment {
    private TextView textView;
    private Banner hot_show_banner;
    private ListView hotshow_listview;
    private String viewpagerUrl = Contacts.HOST_SHOW_VIEWPAGER;
    private String listviewUrl = Contacts.HOST_SHOW_LISTVIEW;
    private List<ViewPagerBean.DataBean> dataBeens;
    private List<ListViewBean.DataBean.MoviesBean> moviesBeens = new ArrayList<>();
    private View headview;
    private PullToRefreshListView pull_refresh_list;

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragement_hot_show,null);
        pull_refresh_list = (PullToRefreshListView) view.findViewById(R.id.pull_refresh_list);
        hotshow_listview = pull_refresh_list.getRefreshableView();

        pull_refresh_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                //请求网络
                getDataFromNet(viewpagerUrl);
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
              Toast.makeText(mContext, "没有更多数据", Toast.LENGTH_SHORT).show();
            }
        });
        SoundPullEventListener<ListView> soundListener = new SoundPullEventListener<ListView>(mContext);
        soundListener.addSoundEvent(PullToRefreshBase.State.PULL_TO_REFRESH, R.raw.pull_event);
        soundListener.addSoundEvent(PullToRefreshBase.State.RESET, R.raw.reset_sound);
        soundListener.addSoundEvent(PullToRefreshBase.State.REFRESHING, R.raw.refreshing_sound);
        pull_refresh_list.setOnPullEventListener(soundListener);


        headview = View.inflate(mContext,R.layout.item_hotshow_banner,null);
        hot_show_banner = (Banner) headview.findViewById(R.id.hot_show_banner);
        textView = (TextView) headview.findViewById(R.id.hotshow_textview);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "搜索", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    @Override
    protected String getUrl() {
        return listviewUrl;
    }


    @Override
    protected void getProgressData(String response) {
        ListViewBean listViewBean =  new Gson().fromJson(response,ListViewBean.class);
        ListViewBean.DataBean dataBean =  listViewBean.getData();
        moviesBeens = dataBean.getMovies();
        Log.e("TAG", "moviesBeens"+moviesBeens.size());
        hotshow_listview.addHeaderView(headview);
        hotshow_listview.setAdapter(new HotShowListViewAdapter(mContext,moviesBeens));
    }

    @Override
    protected void initData() {
        super.initData();
        getDataFromNet(viewpagerUrl);


    }

    private void getDataFromNet(String viewpagerUrl) {
        OkHttpUtils
                .get()
                .url(viewpagerUrl)
                .id(100)
                .build()
                .execute(new MyStringCallback());
    }


    private class MyStringCallback extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {

        }

        @Override
        public void onResponse(String response, int id) {
            pull_refresh_list.onRefreshComplete();
            switch (id) {
                case 100:
//                    Toast.makeText(GoodsListActivity.this, "http", Toast.LENGTH_SHORT).show();
                    if (response != null) {
                        Log.e("TAG", "2222222222");
                        processData(response);
                    }
                    break;
                case 101:
                    break;
            }
        }
    }

    private void processData(String response) {
        Gson gson = new Gson();
        ViewPagerBean viewPagerBean = gson.fromJson(response,ViewPagerBean.class);
        dataBeens = viewPagerBean.getData();

        //2.设置Banner显示图片
        //设置banner样式
        hot_show_banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        //设置图片加载器
        hot_show_banner.setImageLoader(new GlideImageLoader());
        //设置图片url集合:imageUrl
       /* List<String> imageUrl = new ArrayList<String>(images.size());
        for (int i = 0; i < images.size(); i++) {
            imageUrl.add(images.get(i).IMAURL);
            Log.e("TAG", "url = " + images.get(i).IMAURL);
        }*/
        List<String> imageUrl = new ArrayList<>(dataBeens.size());
        for (int i = 0;i<dataBeens.size();i++){
            imageUrl.add(dataBeens.get(i).getImgUrl());
        }
        Log.e("TAG", "size"+imageUrl.size());
        hot_show_banner.setImages(imageUrl);
        //设置banner动画效果
        hot_show_banner.setBannerAnimation(Transformer.DepthPage);
        //设置自动轮播，默认为true
        hot_show_banner.isAutoPlay(true);
        //设置轮播时间
        hot_show_banner.setDelayTime(1500);
        //设置指示器位置（当banner模式中有指示器时）
        hot_show_banner.setIndicatorGravity(BannerConfig.RIGHT);
        //banner设置方法全部调用完毕时最后调用、
        hot_show_banner.setOnBannerClickListener(new OnBannerClickListener() {
            @Override
            public void OnBannerClick(int position) {
                Toast.makeText(mContext, "position = "+(position-1), Toast.LENGTH_SHORT).show();
            }
        });
        hot_show_banner.start();




    }



    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {

            //Picasso 加载图片简单用法
            Picasso.with(context).load((String) path).into(imageView);

        }
    }
}
