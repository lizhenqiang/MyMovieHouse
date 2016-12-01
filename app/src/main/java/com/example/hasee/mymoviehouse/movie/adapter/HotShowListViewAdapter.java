package com.example.hasee.mymoviehouse.movie.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.movie.bean.ListViewBean;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lzq on 2016/11/30.
 */
public class HotShowListViewAdapter extends BaseAdapter {
    private final List<ListViewBean.DataBean.MoviesBean> moviesBeens;
    private final Context mContext;


    public HotShowListViewAdapter(Context mContext, List<ListViewBean.DataBean.MoviesBean> moviesBeens) {
        this.mContext = mContext;
        this.moviesBeens = moviesBeens;
    }

    @Override
    public int getCount() {


        return moviesBeens == null ? null : moviesBeens.size();
    }

    @Override
    public Object getItem(int position) {

        return moviesBeens == null ? null : moviesBeens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.e("sss", "getView");


        ViewHolder holder;
        if (convertView == null) {

            Log.e("sss", "convertView");
            convertView = View.inflate(mContext, R.layout.item_hotshow_listview, null);
            holder = new ViewHolder(convertView);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        convertView.setTag(holder);
        holder.filmTitle.setText(moviesBeens.get(position).getNm());

        if (((moviesBeens.get(position).getSc() == 0.0))) {
            holder.llWantWatch.setVisibility(View.VISIBLE);
            holder.llScore.setVisibility(View.GONE);
            holder.tvWant.setText(moviesBeens.get(position).getWish() + "");

        } else {
            holder.llWantWatch.setVisibility(View.GONE);
            holder.llScore.setVisibility(View.VISIBLE);
            holder.filmScoreAudience.setText(moviesBeens.get(position).getSc() + "");
        }

        Glide.with(mContext)
                .load(moviesBeens.get(position).getImg())
                .into(holder.filmImage);
        holder.tvScm.setText(moviesBeens.get(position).getScm());
        holder.tvShowinfo.setText(moviesBeens.get(position).getShowInfo());

        if (moviesBeens.get(position).isValue3d()) {
            holder.tv3d.setVisibility(View.VISIBLE);
        } else {
            holder.tv3d.setVisibility(View.GONE);
        }
        if (moviesBeens.get(position).isImax()) {
            holder.imax.setVisibility(View.VISIBLE);
        } else {
            holder.imax.setVisibility(View.GONE);
        }
        if (position == 0) {
            holder.llBottom.setVisibility(View.VISIBLE);
        } else {
            holder.llBottom.setVisibility(View.GONE);
        }

        if (moviesBeens.get(position).getPreSale() == 0) {
            holder.tvBuyTickte.setVisibility(View.VISIBLE);
            holder.tvSellTickte.setVisibility(View.GONE);

        }else {
            holder.tvBuyTickte.setVisibility(View.GONE);
            holder.tvSellTickte.setVisibility(View.VISIBLE);
        }



        holder.llZhuanti.setOnClickListener(new MyOnclickListener());
        holder.llZixun.setOnClickListener(new MyOnclickListener());
        holder.llDetail.setOnClickListener(new MyOnclickListener());
        holder.tvBuyTickte.setOnClickListener(new MyOnclickListener());
        holder.tvSellTickte.setOnClickListener(new MyOnclickListener());
        holder.filmImage.setOnClickListener(new MyOnclickListener());

        return convertView;

    }


    static class ViewHolder {
        @Bind(R.id.film_image)
        ImageView filmImage;
        @Bind(R.id.fl_play)
        FrameLayout flPlay;
        @Bind(R.id.film_title)
        TextView filmTitle;
        @Bind(R.id.tv_3d)
        TextView tv3d;
        @Bind(R.id.imax)
        TextView imax;
        @Bind(R.id.film_score_audience)
        TextView filmScoreAudience;
        @Bind(R.id.film_score_profession)
        TextView filmScoreProfession;
        @Bind(R.id.ll_score)
        LinearLayout llScore;
        @Bind(R.id.tv_want)
        TextView tvWant;
        @Bind(R.id.ll_want_watch)
        LinearLayout llWantWatch;
        @Bind(R.id.tv_scm)
        TextView tvScm;
        @Bind(R.id.tv_showinfo)
        TextView tvShowinfo;
        @Bind(R.id.ll_detail)
        LinearLayout llDetail;
        @Bind(R.id.tv_buy_tickte)
        TextView tvBuyTickte;
        @Bind(R.id.tv_sell_tickte)
        TextView tvSellTickte;
        @Bind(R.id.ll_zhuanti)
        LinearLayout llZhuanti;
        @Bind(R.id.ll_zixun)
        LinearLayout llZixun;
        @Bind(R.id.ll_bottom)
        LinearLayout llBottom;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    private class MyOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ll_zhuanti :
                    Toast.makeText(mContext, "专题", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ll_zixun :
                    Toast.makeText(mContext, "资讯", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ll_detail :
                    Toast.makeText(mContext, "详情", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tv_buy_tickte :
                    Toast.makeText(mContext, "购票", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.tv_sell_tickte :
                    Toast.makeText(mContext, "预售", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.film_image :
                    Toast.makeText(mContext, "播放", Toast.LENGTH_SHORT).show();
                    break;


            }
        }
    }
}

