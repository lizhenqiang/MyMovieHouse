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
import com.example.hasee.mymoviehouse.movie.bean.ScrollViewBean2;

import java.util.List;

/**
 * Created by lzq on 2016/12/1.
 */
public class WaitShowScroll2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context mContext;
    private final List<ScrollViewBean2.DataBean.ComingBean> scrollComingBeans;

    public WaitShowScroll2Adapter(Context mContext, List<ScrollViewBean2.DataBean.ComingBean> scrollComingBeans) {
        this.mContext = mContext;
        this.scrollComingBeans = scrollComingBeans;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(mContext, R.layout.item_wait_show_recycle2_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.setData( scrollComingBeans.get(position));
    }

    @Override
    public int getItemCount() {
        return scrollComingBeans.size() ;
    }

    private class ViewHolder extends BaseViewHolder<ScrollViewBean2.DataBean.ComingBean> {
        TextView date;
        ImageView heart;
        ImageView ivMovie;
        TextView tvName;
        TextView tvPeople;
        ImageView red_heart;
        private LinearLayout ll_all;

        public ViewHolder(View itemView) {
            super(itemView, WaitShowScroll2Adapter.this.mContext);
        }

        @Override
        public void initView() {
            date = (TextView) itemView.findViewById(R.id.date);
            heart = (ImageView) itemView.findViewById(R.id.heart);
            ivMovie = (ImageView) itemView.findViewById(R.id.iv_movie2);

            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvPeople = (TextView) itemView.findViewById(R.id.tv_people);
            red_heart = (ImageView) itemView.findViewById(R.id.red_heart);
            ll_all = (LinearLayout) itemView.findViewById(R.id.ll_all);


        }

        @Override
        public void setData(final ScrollViewBean2.DataBean.ComingBean comingBeen) {

            String data = comingBeen.getComingTitle();
            if(data.contains("年")) {
                data = data.substring(2);
            }
            if(data.contains("周")) {
                data=data.substring(0,data.length()-2);
            }
            date.setText(data);
            tvName.setText(comingBeen.getNm());
            tvPeople.setText(comingBeen.getWish()+"");
            String url = comingBeen.getImg();
            int index = url.indexOf("w");
            String url1 = url.substring(0,index);
            String url2 = url.substring(index+4);
            Log.e("sssss", ""+url1+url2);
            Glide.with(mContext)
                    .load(url1+url2)
                    .into(ivMovie);

            ll_all.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, ""+comingBeen.getNm(), Toast.LENGTH_SHORT).show();
                }
            });


        }
    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case  R.id.red_heart:

                    break;
            }
        }
    }
}
