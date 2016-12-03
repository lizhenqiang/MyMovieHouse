package com.example.hasee.mymoviehouse.movie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.BaseViewHolder;
import com.example.hasee.mymoviehouse.movie.bean.FindMoviesHuoJiangBean;
import com.example.hasee.mymoviehouse.utils.UrlUtils;

import java.util.List;

/**
 * Created by lzq on 2016/12/3.
 */
public class FindMoviesJiangxiangAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context mContext;
    private final List<FindMoviesHuoJiangBean.DataBean> huojiangDataBeen;



    public FindMoviesJiangxiangAdapter(Context mContext, List<FindMoviesHuoJiangBean.DataBean> huojiangDataBeen) {
        this.mContext = mContext;
        this.huojiangDataBeen = huojiangDataBeen;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(mContext, R.layout.item_find_movies_jiangxiang, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.setData(huojiangDataBeen.get(position));
    }

    @Override
    public int getItemCount() {
        return huojiangDataBeen.size();
    }


    private class ViewHolder extends BaseViewHolder<FindMoviesHuoJiangBean.DataBean> {
        ImageView ivMovie;
        TextView tvName;
        LinearLayout llJiangxiang;

        TextView tv_all;
        TextView tvTatle;
        TextView tvDate;
        TextView tvJiangxiang;

        public ViewHolder(View itemView) {
            super(itemView, FindMoviesJiangxiangAdapter.this.mContext);

        }

        @Override
        public void initView() {
            tvTatle = (TextView) itemView.findViewById(R.id.tv_tatle);
            tvDate = (TextView) itemView.findViewById(R.id.tv_date);
            tvJiangxiang = (TextView) itemView.findViewById(R.id.tv_jiangxiang);
            ivMovie = (ImageView) itemView.findViewById(R.id.iv_movie);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            llJiangxiang = (LinearLayout) itemView.findViewById(R.id.ll_jiangxiang);
            Log.e("TAG", "ssssssss");
//            tv_all.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(mContext, "全播电影奖项", Toast.LENGTH_SHORT).show();
//                }
//            });

        }


        @Override
        public void setData(final FindMoviesHuoJiangBean.DataBean dataBean) {
            tvName.setText(dataBean.getMovieName());
            String data = dataBean.getHeldDate().substring(5);

            tvDate.setText(data);
            tvTatle.setText(dataBean.getFestivalName());
            tvJiangxiang.setText(dataBean.getPrizeName());
            Glide.with(mContext)
                    .load(UrlUtils.getTrueUrl(dataBean.getImg()))
                    .into(ivMovie);


            tvTatle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, ""+dataBean.getFestivalName(), Toast.LENGTH_SHORT).show();
                }
            });

            ivMovie.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, ""+dataBean.getMovieName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }



}
