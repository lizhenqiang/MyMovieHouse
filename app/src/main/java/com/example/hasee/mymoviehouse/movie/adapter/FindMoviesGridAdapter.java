package com.example.hasee.mymoviehouse.movie.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.movie.bean.GridDataBean;
import com.example.hasee.mymoviehouse.movie.bean.GridViewHotShowBean;
import com.example.hasee.mymoviehouse.movie.bean.GridViewQiDaiBean;
import com.example.hasee.mymoviehouse.movie.bean.GridViewTop100Bean;
import com.example.hasee.mymoviehouse.movie.bean.ListViewHaiWaiHanGuoBean;
import com.example.hasee.mymoviehouse.movie.bean.ListViewHaiWaiJapanBean;
import com.example.hasee.mymoviehouse.movie.bean.ListViewHaiWaiUSBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lzq on 2016/12/2.
 */
public class FindMoviesGridAdapter extends BaseAdapter {
    private Context mContext;
    private List<GridDataBean> gridDataBeen;
    private List<GridViewQiDaiBean.DataBean.MoviesBean> qidaiMoviesBeen;
    private List<GridViewHotShowBean.DataBean.MoviesBean> hotShowMoviesBeen;
    private List<GridViewTop100Bean.DataBean.MoviesBean> topMoviesBeen;
    private List<ListViewHaiWaiUSBean.DataBean.ComingBean> usComingBeen;
    private List<ListViewHaiWaiJapanBean.DataBean.HotBean> japanHotBeen;
    private List<ListViewHaiWaiHanGuoBean.DataBean.HotBean> hanguoHotBeen;

    public FindMoviesGridAdapter(Context mContext, List<GridViewQiDaiBean.DataBean.MoviesBean> qidaiMoviesBeen, List<GridViewHotShowBean.DataBean.MoviesBean> hotShowMoviesBeen, List<GridViewTop100Bean.DataBean.MoviesBean> topMoviesBeen, List<ListViewHaiWaiUSBean.DataBean.ComingBean> usComingBeen, List<ListViewHaiWaiJapanBean.DataBean.HotBean> japanHotBeen, List<ListViewHaiWaiHanGuoBean.DataBean.HotBean> hanguoHotBeen) {
        this.mContext=mContext;
        this.qidaiMoviesBeen=qidaiMoviesBeen;
        this.hanguoHotBeen = hanguoHotBeen;
        this.hotShowMoviesBeen = hotShowMoviesBeen;
        this.topMoviesBeen = topMoviesBeen;
        this.usComingBeen = usComingBeen;
        this.japanHotBeen = japanHotBeen;
        gridDataBeen= new ArrayList<>();
        initDataBeen();
    }



    private void initDataBeen() {
        GridDataBean gridDataBean1 = new GridDataBean();
        gridDataBean1.setTopic("热映口碑");
        gridDataBean1.setName(hotShowMoviesBeen.get(0).getNm());
        gridDataBean1.setSrc(hotShowMoviesBeen.get(0).getImg());
        gridDataBean1.setBg(hotShowMoviesBeen.get(1).getImg());

        gridDataBeen.add(gridDataBean1);



        GridDataBean gridDataBean2 = new GridDataBean();
        gridDataBean2.setTopic("最受期待");
        gridDataBean2.setName(qidaiMoviesBeen.get(0).getNm());
        gridDataBean2.setSrc(qidaiMoviesBeen.get(0).getImg());
        gridDataBean2.setBg(qidaiMoviesBeen.get(1).getImg());

        gridDataBeen.add(gridDataBean2);


        GridDataBean gridDataBean3 = new GridDataBean();
        gridDataBean3.setTopic("海外电影");
        gridDataBean3.setName(usComingBeen.get(0).getNm());
        gridDataBean3.setSrc(usComingBeen.get(0).getImg());
        gridDataBean3.setBg(usComingBeen.get(1).getImg());

        gridDataBeen.add(gridDataBean3);


        GridDataBean gridDataBean4 = new GridDataBean();
        gridDataBean4.setTopic("Top100");
        gridDataBean4.setName(topMoviesBeen.get(0).getNm());
        gridDataBean4.setSrc(topMoviesBeen.get(0).getImg());
        gridDataBean4.setBg(topMoviesBeen.get(1).getImg());

        gridDataBeen.add(gridDataBean4);

    }

    @Override
    public int getCount() {
        return gridDataBeen.size();
    }
    @Override
    public Object getItem(int position) {
        return gridDataBeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_find_movies_gridview, null);
            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        if(position==0) {
            holder.tvTopic.setTextColor(Color.rgb(42,173,240));
        }else if(position==1) {
            holder.tvTopic.setTextColor(Color.rgb(245,113,98));
        }else if(position==2){
            holder.tvTopic.setTextColor(Color.rgb(246,123,41));
        }else if(position==3) {
            holder.tvTopic.setTextColor(Color.rgb(130,199,67));
        }

        holder.tvName.setText(gridDataBeen.get(position).getName());
        holder.tvTopic.setText(gridDataBeen.get(position).getTopic());
        Glide.with(mContext)
                .load(gridDataBeen.get(position).getSrc())
                .into(holder.ivSrc);
        Glide.with(mContext)
                .load(gridDataBeen.get(position).getBg())
                .into(holder.ivBg);
        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.tv_topic)
        TextView tvTopic;
        @Bind(R.id.tv_name)
        TextView tvName;
        @Bind(R.id.iv_src)
        ImageView ivSrc;
        @Bind(R.id.iv_bg)
        ImageView ivBg;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
