package com.example.hasee.mymoviehouse.movie.fragment;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;
import com.example.hasee.mymoviehouse.movie.adapter.HotShowListViewAdapter;
import com.example.hasee.mymoviehouse.movie.bean.ViewPagerBean;
import com.example.hasee.mymoviehouse.utils.Contacts;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
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
    private Banner hot_show_banner;
    private ListView hotshow_listview;
    private String viewpagerUrl = Contacts.HOST_SHOW_VIEWPAGER;
    private String listviewUrl = Contacts.HOST_SHOW_LISTVIEW;
    private List<ViewPagerBean.DataBean> dataBeens;
    private List<String> listViewBeens = new ArrayList<>();
     @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragement_hot_show,null);
        hotshow_listview = (ListView) view.findViewById(R.id.hotshow_listview);

        View headview = View.inflate(mContext,R.layout.item_hotshow_banner,null);
        hot_show_banner = (Banner) headview.findViewById(R.id.hot_show_banner);


        //以头的方式添加顶部轮播图
        hotshow_listview.addHeaderView(headview);

         for (int i=0;i<100;i++){
             listViewBeens.add("aaaaaa"+i);
         }
        hotshow_listview.setAdapter(new HotShowListViewAdapter(mContext,listViewBeens));
        return view;
    }

    @Override
    protected String getUrl() {
        return listviewUrl;
    }


    @Override
    public void initData() {

        getDataFromNet(viewpagerUrl);


    }

    @Override
    protected void getProgressData(String response) {

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
        Log.e("TAG", "eeeeeee");
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
        //banner设置方法全部调用完毕时最后调用
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
