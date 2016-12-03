package com.example.hasee.mymoviehouse.movie.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;
import com.example.hasee.mymoviehouse.movie.adapter.FindMoviesJiangxiangAdapter;
import com.example.hasee.mymoviehouse.movie.bean.FindMoviesHuoJiangBean;
import com.example.hasee.mymoviehouse.movie.bean.FindMoviesTopicBean;
import com.example.hasee.mymoviehouse.movie.bean.GridViewHotShowBean;
import com.example.hasee.mymoviehouse.movie.bean.GridViewQiDaiBean;
import com.example.hasee.mymoviehouse.movie.bean.GridViewTop100Bean;
import com.example.hasee.mymoviehouse.movie.bean.ListViewHaiWaiHanGuoBean;
import com.example.hasee.mymoviehouse.movie.bean.ListViewHaiWaiJapanBean;
import com.example.hasee.mymoviehouse.movie.bean.ListViewHaiWaiUSBean;
import com.example.hasee.mymoviehouse.utils.Contacts;
import com.example.hasee.mymoviehouse.utils.DensityUtil;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * Created by lzq on 2016/11/30.
 */
public class FindMoviesFragment extends Basefragment {

    @Bind(R.id.tv_all)
    TextView tvAll;
    @Bind(R.id.hotshow_textview)
    TextView hotshowTextview;
    @Bind(R.id.ll_scroll1)
    LinearLayout llScroll1;
    @Bind(R.id.ll_scroll2)
    LinearLayout llScroll2;
    @Bind(R.id.ll_scroll3)
    LinearLayout llScroll3;
    @Bind(R.id.tv_topic1)
    TextView tvTopic1;
    @Bind(R.id.tv_name1)
    TextView tvName1;
    @Bind(R.id.iv_src1)
    ImageView ivSrc1;
    @Bind(R.id.iv_bg1)
    ImageView ivBg1;
    @Bind(R.id.grid1)
    RelativeLayout grid1;
    @Bind(R.id.tv_topic2)
    TextView tvTopic2;
    @Bind(R.id.tv_name2)
    TextView tvName2;
    @Bind(R.id.iv_src2)
    ImageView ivSrc2;
    @Bind(R.id.iv_bg2)
    ImageView ivBg2;
    @Bind(R.id.grid2)
    RelativeLayout grid2;
    @Bind(R.id.tv_topic3)
    TextView tvTopic3;
    @Bind(R.id.tv_name3)
    TextView tvName3;
    @Bind(R.id.iv_src3)
    ImageView ivSrc3;
    @Bind(R.id.iv_bg3)
    ImageView ivBg3;
    @Bind(R.id.grid3)
    RelativeLayout grid3;
    @Bind(R.id.tv_topic4)
    TextView tvTopic4;
    @Bind(R.id.tv_name4)
    TextView tvName4;
    @Bind(R.id.iv_src4)
    ImageView ivSrc4;
    @Bind(R.id.iv_bg4)
    ImageView ivBg4;
    @Bind(R.id.grid4)
    RelativeLayout grid4;
    @Bind(R.id.rc_jiangxiang)
    RecyclerView rcJiangxiang;
    private String qidaiUrl = Contacts.FIND_MOVIES_ZUI_QIDAI;
    private String reyingUrl = Contacts.FIND_MOVIES_HOT_KOUBEI;
    private String haiwaiUrl = Contacts.FIND_MOVIES_HAI_WAI;
    private String topUrl = Contacts.FIND_MOVIES_TOP_100;
    private String usUrl = Contacts.FIND_USA;
    private String japanUrl = Contacts.FIND_JAPAN;
    private String hanguoUrl = Contacts.FIND_HANGUO;
    private  String topicUrl = Contacts.FIID_MOVIES_TOPIC;

    private String jiangxiangUrl = Contacts.FIIND_MOVIES_QUANQIU;

    String[] scroll1 = {"爱情", "喜剧", "动画", "剧情", "恐怖", "惊悚", "科幻", "动作", "悬疑", "犯罪", "冒险", "战争", "奇幻", "运动", "家庭", "古装", "武侠", "西部", "历史", "传记", "情色", "歌舞", "黑色电影", "短片", "纪录片", "其他"};
    String[] scroll2 = {"大陆", "美国", "韩国", "日本", "中国香港", "中国台湾", "泰国", "印度", "法国", "英国", "俄罗斯", "意大利", "西班牙", "德国", "波兰", "澳大利亚", "伊朗", "其他"};
    String[] scroll3 = {"2017以后", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2000-2010", "90年代", "80年代", "70年代", "更早"};
    private List<GridViewQiDaiBean.DataBean.MoviesBean> qidaiMoviesBeen;
    private List<GridViewHotShowBean.DataBean.MoviesBean> hotShowMoviesBeen;
    private List<GridViewTop100Bean.DataBean.MoviesBean> topMoviesBeen;
    private List<ListViewHaiWaiUSBean.DataBean.ComingBean> usComingBeen;
    private List<ListViewHaiWaiJapanBean.DataBean.HotBean> japanHotBeen;
    private List<ListViewHaiWaiHanGuoBean.DataBean.HotBean> hanguoHotBeen;
    private List<FindMoviesTopicBean.DataBean> dataBeen;
    private List<FindMoviesHuoJiangBean.DataBean> huojiangDataBeen;
    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_find_movies, null);
        ButterKnife.bind(this, view);
        initView2();

        return view;
    }

    private void initView2() {
        TextView view1 = (TextView) View.inflate(mContext, R.layout.text_find_movies, null);
        view1.setText("类型");
        TextView view2 = (TextView) View.inflate(mContext, R.layout.text_find_movies, null);
        view2.setText("地区");
        TextView view3 = (TextView) View.inflate(mContext, R.layout.text_find_movies, null);
        view3.setText("年代");
        llScroll1.addView(view1);
        llScroll2.addView(view2);
        llScroll3.addView(view3);


    }

    @Override
    protected String getUrl() {
        return topicUrl;
    }

    @Override
    protected void getProgressData(String response) {
        FindMoviesTopicBean topicBean = new Gson().fromJson(response, FindMoviesTopicBean.class);
        dataBeen = topicBean.getData();

        tvTopic1.setText(dataBeen.get(0).getBoardName());
        tvTopic2.setText(dataBeen.get(1).getBoardName());
        tvTopic3.setText(dataBeen.get(2).getBoardName());
        tvTopic4.setText(dataBeen.get(3).getBoardName());

        tvName1.setText(dataBeen.get(0).getMovieName());
        tvName2.setText(dataBeen.get(1).getMovieName());
        tvName3.setText(dataBeen.get(2).getMovieName());
        tvName4.setText(dataBeen.get(3).getMovieName());

        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(0).getMovieImgs().get(0)))
                .into(ivBg1);
        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(0).getMovieImgs().get(1)))
                .into(ivSrc1);

        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(1).getMovieImgs().get(0)))
                .into(ivBg2);
        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(1).getMovieImgs().get(1)))
                .into(ivSrc2);


        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(2).getMovieImgs().get(0)))
                .into(ivBg2);
        Log.e("ddd", "getTrueUrl(dataBeen.get(2).getMovieImgs().get(0))"+getTrueUrl(dataBeen.get(2).getMovieImgs().get(0)));
        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(2).getMovieImgs().get(1)))
                .into(ivSrc2);
        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(3).getMovieImgs().get(0)))
                .into(ivBg2);
        Glide.with(mContext)
                .load(getTrueUrl(dataBeen.get(3).getMovieImgs().get(1)))
                .into(ivSrc2);

        grid1.setOnClickListener(new MyOnClickListener());
        grid2.setOnClickListener(new MyOnClickListener());
        grid3.setOnClickListener(new MyOnClickListener());
        grid4.setOnClickListener(new MyOnClickListener());
        tvAll.setOnClickListener(new MyOnClickListener());
    }

    @Override
    protected void initData() {

        for (int i = 0; i < scroll1.length; i++) {
            TextView view = (TextView) View.inflate(mContext, R.layout.text2_find_movies, null);
            Log.e("TAG", "" + i);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(DensityUtil.dip2px(mContext, 60), DensityUtil.dip2px(mContext, 25));
            params.leftMargin = DensityUtil.dip2px(mContext, 5);
            params.rightMargin = DensityUtil.dip2px(mContext, 5);
            view.setLayoutParams(params);
            view.setText(scroll1[i]);
            final int finalI = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "" + scroll1[finalI], Toast.LENGTH_SHORT).show();
                }
            });
            llScroll1.addView(view);
        }
        for (int i = 0; i < scroll2.length; i++) {
            TextView view = (TextView) View.inflate(mContext, R.layout.text2_find_movies, null);
            Log.e("TAG", "" + i);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(DensityUtil.dip2px(mContext, 60), DensityUtil.dip2px(mContext, 25));
            params.leftMargin = DensityUtil.dip2px(mContext, 5);
            params.rightMargin = DensityUtil.dip2px(mContext, 5);
            view.setLayoutParams(params);
            view.setText(scroll2[i]);
            final int finalI = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "" + scroll2[finalI], Toast.LENGTH_SHORT).show();
                }
            });
            llScroll2.addView(view);
        }
        for (int i = 0; i < scroll3.length; i++) {
            TextView view = (TextView) View.inflate(mContext, R.layout.text2_find_movies, null);
            Log.e("TAG", "" + i);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(DensityUtil.dip2px(mContext, 60), DensityUtil.dip2px(mContext, 25));
            params.leftMargin = DensityUtil.dip2px(mContext, 5);
            params.rightMargin = DensityUtil.dip2px(mContext, 5);
            view.setLayoutParams(params);
            view.setText(scroll3[i]);
            final int finalI = i;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "" + scroll3[finalI], Toast.LENGTH_SHORT).show();
                }
            });
            llScroll3.addView(view);
        }


        getdatafromnet(jiangxiangUrl);
        //getDataFromNet1(qidaiUrl);


    }

    private void getdatafromnet(String jiangxiangUrl) {
        OkHttpUtils
                .get()
                .url(jiangxiangUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        processData(response);
                    }
                });
    }

    private void processData(String response) {
        FindMoviesHuoJiangBean findMoviesHuoJiangBean = new Gson().fromJson(response,FindMoviesHuoJiangBean.class);
        huojiangDataBeen = findMoviesHuoJiangBean.getData();


        rcJiangxiang.setAdapter(new FindMoviesJiangxiangAdapter(mContext,huojiangDataBeen));
        LinearLayoutManager manager = new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
        rcJiangxiang.setLayoutManager(manager);
    }

    private void getDataFromNet1(String qidaiUrl) {

        OkHttpUtils
                .get()
                .url(qidaiUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData1(response);
                    }
                });
    }

    private void processData1(String response) {
        GridViewQiDaiBean gridViewQiDaiBean = new Gson().fromJson(response, GridViewQiDaiBean.class);

        qidaiMoviesBeen = gridViewQiDaiBean.getData().getMovies();

        Log.e("mmm", "" + qidaiMoviesBeen.size());
        getDataFromNet2(reyingUrl);
    }

    private void getDataFromNet2(String reyingUrl) {
        OkHttpUtils
                .get()
                .url(reyingUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData2(response);
                    }
                });
    }

    private void processData2(String response) {
        GridViewHotShowBean gridViewHotShowBean = new Gson().fromJson(response, GridViewHotShowBean.class);

        hotShowMoviesBeen = gridViewHotShowBean.getData().getMovies();
        Log.e("mmm", "hotShowMoviesBeen" + hotShowMoviesBeen.size());
        getDataFromNet3(topUrl);
    }

    private void getDataFromNet3(String topUrl) {
        OkHttpUtils
                .get()
                .url(topUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData3(response);
                    }
                });
    }

    private void processData3(String response) {
        GridViewTop100Bean gridViewTop100Bean = new Gson().fromJson(response, GridViewTop100Bean.class);

        topMoviesBeen = gridViewTop100Bean.getData().getMovies();
        Log.e("mmm", "topMoviesBeen" + topMoviesBeen.size());
        getDataFromNet4(usUrl);
    }

    private void getDataFromNet4(String usUrl) {
        OkHttpUtils
                .get()
                .url(usUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData4(response);
                    }
                });
    }

    private void processData4(String response) {
        ListViewHaiWaiUSBean listViewHaiWaiUSBean = new Gson().fromJson(response, ListViewHaiWaiUSBean.class);

        usComingBeen = listViewHaiWaiUSBean.getData().getComing();
        Log.e("mmm", "usComingBeen" + usComingBeen.size());
        getDataFromNet5(japanUrl);
    }

    private void getDataFromNet5(String japanUrl) {
        OkHttpUtils
                .get()
                .url(japanUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData5(response);
                    }
                });
    }

    private void processData5(String response) {
        ListViewHaiWaiJapanBean listViewHaiWaiJapanBean = new Gson().fromJson(response, ListViewHaiWaiJapanBean.class);
        japanHotBeen = listViewHaiWaiJapanBean.getData().getHot();
        Log.e("mmm", "japanHotBeen" + japanHotBeen.size());
        getDataFromNet6(hanguoUrl);
    }

    private void getDataFromNet6(String hanguoUrl) {
        OkHttpUtils
                .get()
                .url(hanguoUrl)
                .id(100)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        processData6(response);
                    }
                });
    }

    private void processData6(String response) {
        ListViewHaiWaiHanGuoBean listViewHaiWaiHanGuoBean = new Gson().fromJson(response, ListViewHaiWaiHanGuoBean.class);
        hanguoHotBeen = listViewHaiWaiHanGuoBean.getData().getHot();
        Log.e("mmm", "hanguoHotBeen" + hanguoHotBeen.size());

        tvName1.setText(hotShowMoviesBeen.get(0).getNm());
        tvName2.setText(qidaiMoviesBeen.get(0).getNm());
        tvName3.setText(usComingBeen.get(0).getNm());
        tvName4.setText(topMoviesBeen.get(0).getNm());



        Glide.with(mContext)
                .load(getTrueUrl(hotShowMoviesBeen.get(0).getImg()))
                .into(ivBg1);
        Glide.with(mContext)
                .load(getTrueUrl(hotShowMoviesBeen.get(1).getImg()))
                .into(ivSrc1);

        Glide.with(mContext)
                .load(getTrueUrl(qidaiMoviesBeen.get(0).getImg()))
                .into(ivBg2);
        Glide.with(mContext)
                .load(getTrueUrl(qidaiMoviesBeen.get(1).getImg()))
                .into(ivSrc2);


        Log.e("sss", "qidaiMoviesBeen.get(1).getImg())"+qidaiMoviesBeen.get(1).getImg() );


        Glide.with(mContext)
                .load(getTrueUrl(usComingBeen.get(0).getImg()))
                .into(ivBg3);

        Glide.with(mContext)
                .load(getTrueUrl(usComingBeen.get(1).getImg()))
                .into(ivSrc3);


        Glide.with(mContext)
                .load(getTrueUrl(topMoviesBeen.get(0).getImg()))
                .into(ivBg4);
        Glide.with(mContext)
                .load(getTrueUrl(topMoviesBeen.get(1).getImg()))
                .into(ivSrc4);

        grid1.setOnClickListener(new MyOnClickListener());
        grid2.setOnClickListener(new MyOnClickListener());
        grid3.setOnClickListener(new MyOnClickListener());
        grid4.setOnClickListener(new MyOnClickListener());



    }

    private String getTrueUrl(String img) {
        int index = img.indexOf("w");
        String url1 = img.substring(0,index);
        String url2 = img.substring(index+4);
        return url1+url2;
    }




    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.grid1:
                    Toast.makeText(mContext, "热映口碑", Toast.LENGTH_SHORT).show();
                break;
                case R.id.grid2:
                    Toast.makeText(mContext, "最受期待", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.grid3:
                    Toast.makeText(mContext, "海外电影", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.grid4:
                    Toast.makeText(mContext, "Top100", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tv_all:
                    Toast.makeText(mContext ,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            "全部电影奖项", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
