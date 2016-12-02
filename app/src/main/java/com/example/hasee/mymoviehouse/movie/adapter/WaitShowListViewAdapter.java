package com.example.hasee.mymoviehouse.movie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.BaseViewHolder;
import com.example.hasee.mymoviehouse.movie.bean.RecycleViewBean;

import java.util.List;

/**
 * Created by lzq on 2016/12/2.
 */
public class WaitShowListViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private final Context mContext;
    private final List<RecycleViewBean.DataBean.ComingBean> recycleComingBeans;


    public WaitShowListViewAdapter(Context mContext, List<RecycleViewBean.DataBean.ComingBean> recycleComingBeans) {
        this.mContext = mContext;
        this.recycleComingBeans = recycleComingBeans;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return  new ViewHolder(View.inflate(mContext, R.layout.item_wait_show_recycle3_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.setData( recycleComingBeans.get(position));

        viewHolder.setData2(position);


    }

    @Override
    public int getItemCount() {
        return recycleComingBeans.size();
    }


    private class ViewHolder extends BaseViewHolder<RecycleViewBean.DataBean.ComingBean> {

        TextView tvDate;
        ImageView filmImage;
        FrameLayout flPlay;
        TextView filmTitle;
        TextView tv3d;
        TextView imax;
        TextView filmScoreProfession;
        LinearLayout llScore;
        TextView tvWant;
        LinearLayout llWantWatch;
        TextView tvScm;
        TextView tvShowinfo;
        LinearLayout llDetail;
        TextView tvWantWatch;
        TextView tvSellTickte;

        public ViewHolder(View itemView) {

            super(itemView, WaitShowListViewAdapter.this.mContext);
        }

        @Override
        public void initView() {
            tvDate  = (TextView) itemView.findViewById(R.id.tv_date);
            filmImage  = (ImageView) itemView.findViewById(R.id.film_image);
            flPlay  = (FrameLayout) itemView.findViewById(R.id.fl_play);
            filmScoreProfession  = (TextView) itemView.findViewById(R.id.film_score_profession);
            filmTitle  = (TextView) itemView.findViewById(R.id.film_title);
            tv3d  = (TextView) itemView.findViewById(R.id.tv_3d);
            imax  = (TextView) itemView.findViewById(R.id.imax);
            llScore  = (LinearLayout) itemView.findViewById(R.id.ll_score);
            tvWant  = (TextView) itemView.findViewById(R.id.tv_want);
            llWantWatch  = (LinearLayout) itemView.findViewById(R.id.ll_want_watch);
            tvScm  = (TextView) itemView.findViewById(R.id.tv_scm);
            tvShowinfo  = (TextView) itemView.findViewById(R.id.tv_showinfo);
            llDetail  = (LinearLayout) itemView.findViewById(R.id.ll_detail);
            tvWantWatch  = (TextView) itemView.findViewById(R.id.tv_want_watch);
            tvSellTickte = (TextView) itemView.findViewById(R.id.tv_sell_tickte);


            filmImage.setOnClickListener(new MyOnclickListener());
            llDetail.setOnClickListener(new MyOnclickListener());
            tvWantWatch.setOnClickListener(new MyOnclickListener());
            tvSellTickte.setOnClickListener(new MyOnclickListener());
        }

        @Override
        public void setData(RecycleViewBean.DataBean.ComingBean comingBeen) {
            tvDate.setText(comingBeen.getComingTitle());
            filmTitle.setText(comingBeen.getNm());
            
            if(comingBeen.getVer().contains("3D")) {
                tv3d.setText("3D");
                tv3d.setVisibility(View.VISIBLE);
            }/*else if(comingBeen.getVer().contains("2D")) {
                tv3d.setText("2D");
                tv3d.setVisibility(View.VISIBLE);
            }*/else {
                tv3d.setVisibility(View.GONE);
            }

            if(comingBeen.getVer().contains("IMAX")) {
                imax.setVisibility(View.VISIBLE);
            }else {
                imax.setVisibility(View.GONE);
            }

            tvWant.setText(comingBeen.getWish()+"");
            tvScm.setText(comingBeen.getScm());
            tvShowinfo.setText(comingBeen.getDesc());


            //http://p1.meituan.net/w.h/movie/7b4cfde9fbae220cd5f1cff734c20e92430358.jpg

            String url = comingBeen.getImg();
            int index = url.indexOf("w");
            String url1 = url.substring(0,index);
            String url2 = url.substring(index+4);
            Glide.with(mContext)
                    .load(url1+url2)
                    .into(filmImage);


        }

        public void setData2(int position) {
            String word = recycleComingBeans.get(position).getComingTitle();
            if(position==0) {
                tvDate.setVisibility(View.VISIBLE);
            }else{
                String preWord=recycleComingBeans.get(position-1).getComingTitle();
                if(preWord.equals(word)) {
                   tvDate.setVisibility(View.GONE);
                }else {
                    tvDate.setVisibility(View.VISIBLE);
                }
            }

            if(position%3==0||position%4==0) {
                tvWantWatch.setVisibility(View.VISIBLE);
                tvSellTickte.setVisibility(View.GONE);
            }else {
                tvWantWatch.setVisibility(View.GONE);
                tvSellTickte.setVisibility(View.VISIBLE);
            }
        }
    }

    private class MyOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case  R.id.film_image:
            Toast.makeText(mContext, "播放", Toast.LENGTH_SHORT).show();
                    break;
                case  R.id.ll_detail:
                    Toast.makeText(mContext, "详情", Toast.LENGTH_SHORT).show();
                    break;

                case  R.id.tv_want_watch:
                    Toast.makeText(mContext, "想看", Toast.LENGTH_SHORT).show();
                    break;
                case  R.id.tv_sell_tickte:
                    Toast.makeText(mContext, "预售", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}

