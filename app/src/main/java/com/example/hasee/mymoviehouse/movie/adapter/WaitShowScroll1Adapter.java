package com.example.hasee.mymoviehouse.movie.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.BaseViewHolder;
import com.example.hasee.mymoviehouse.movie.bean.ScrollViewBean1;

import java.util.List;

/**
 * Created by lzq on 2016/12/2.
 */
public class WaitShowScroll1Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context mContext;
    private final List<ScrollViewBean1.DataBean> scrollDataBeans;

    public WaitShowScroll1Adapter(Context mContext, List<ScrollViewBean1.DataBean> scrollDataBeans) {
        this.mContext = mContext;
        this.scrollDataBeans = scrollDataBeans;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(mContext, R.layout.item_wait_show_recycle1_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.setData(scrollDataBeans.get(position));
    }

    @Override
    public int getItemCount() {
        return scrollDataBeans.size() ;
    }

    private class ViewHolder extends BaseViewHolder<ScrollViewBean1.DataBean> {

        ImageView ivMovie;
        TextView tvName;
        TextView tvOrigin;

        public ViewHolder(View itemView) {
            super(itemView, WaitShowScroll1Adapter.this.mContext);
        }

        @Override
        public void initView() {
            ivMovie = (ImageView) itemView.findViewById(R.id.iv_movie);

            tvName = (TextView) itemView.findViewById(R.id.tv_name);

            tvOrigin = (TextView) itemView.findViewById(R.id.tv_yugao);
        }

        @Override
        public void setData(ScrollViewBean1.DataBean comingBeen) {

            tvName.setText(comingBeen.getMovieName());
            tvOrigin.setText(comingBeen.getOriginName());
            Glide.with(mContext)
                    .load(comingBeen.getImg())
                    .into(ivMovie);
        }
    }
}
