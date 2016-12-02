package com.example.hasee.mymoviehouse.movie.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.BaseViewHolder;
import com.example.hasee.mymoviehouse.movie.bean.RecycleViewBean;
import com.example.hasee.mymoviehouse.movie.bean.ScrollViewBean1;
import com.example.hasee.mymoviehouse.movie.bean.ScrollViewBean2;

import java.util.List;

/**
 * Created by lzq on 2016/12/1.
 */
public class WaitShowRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<ScrollViewBean1.DataBean> scrollDataBeens;
    private Context mContext;

    private List<RecycleViewBean.DataBean.ComingBean> recycleComingBeans;
    private List<ScrollViewBean2.DataBean.ComingBean> scrollComingBeans;


    public static final int SCROLLVIEW1 = 0;


    public static final int SCROLLVIEW2 = 1;


    public static final int RECYCLEVIEW = 2;
    public int currentType = SCROLLVIEW1;


    public WaitShowRecycleAdapter(Context mContext, List<RecycleViewBean.DataBean.ComingBean> recycleComingBeans, List<ScrollViewBean2.DataBean.ComingBean> scrollComingBeans, List<ScrollViewBean1.DataBean> scrollDataBeens) {
        this.mContext=mContext;
        this.recycleComingBeans=recycleComingBeans;
        this.scrollComingBeans = scrollComingBeans;
        this.scrollDataBeens = scrollDataBeens;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == SCROLLVIEW1) {
            return new SCROLLVIEW1ViewHolder(View.inflate(mContext,R.layout.item_wait_show_recycle1, null), mContext);
        } else if (viewType == SCROLLVIEW2) {
            return new SCROLLVIEW2ViewHolder(View.inflate(mContext,R.layout.item_wait_show_recycle2, null), mContext);
        } else if (viewType == RECYCLEVIEW) {
            return new RECYCLEVIEWHolder(View.inflate(mContext,R.layout.item_wait_show_recycle3, null), mContext);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

         if (getItemViewType(position) == SCROLLVIEW1) {
            SCROLLVIEW1ViewHolder scrollview1ViewHolder = (SCROLLVIEW1ViewHolder) holder;
             scrollview1ViewHolder.setData(scrollDataBeens);
        } else if (getItemViewType(position) == SCROLLVIEW2) {
            SCROLLVIEW2ViewHolder scrollview2ViewHolder = (SCROLLVIEW2ViewHolder) holder;
            scrollview2ViewHolder.setData(scrollComingBeans);
        } else if (getItemViewType(position) == RECYCLEVIEW) {
            RECYCLEVIEWHolder recycleviewHolder = (RECYCLEVIEWHolder) holder;
            recycleviewHolder.setData(recycleComingBeans);
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case SCROLLVIEW1:
                currentType = SCROLLVIEW1;
                break;
            case SCROLLVIEW2:
                currentType = SCROLLVIEW2;
                break;
            case RECYCLEVIEW:
                currentType = RECYCLEVIEW;
                break;

        }
        return currentType;
    }



    private class SCROLLVIEW1ViewHolder extends BaseViewHolder<List<ScrollViewBean1.DataBean>> {
        public SCROLLVIEW1ViewHolder(View inflate, Context mContext) {
            super(inflate,mContext);
        }

        private  TextView textView;
        private RecyclerView recyclerView;
        @Override
        public void initView() {
            textView = (TextView) itemView.findViewById(R.id.hotshow_textview);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.rv_wait_show_recycle1);
        }

        @Override
        public void setData(List<ScrollViewBean1.DataBean> scrollComingBeans) {
            recyclerView.setAdapter(new WaitShowScroll1Adapter(mContext,scrollDataBeens));
            LinearLayoutManager manager = new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
            recyclerView.setLayoutManager(manager);
        }
    }

    private class SCROLLVIEW2ViewHolder extends BaseViewHolder<List<ScrollViewBean2.DataBean.ComingBean>> {
        private RecyclerView recyclerView;

        public SCROLLVIEW2ViewHolder(View view, Context mContext) {

            super(view,mContext);
        }

        @Override
        public void initView() {
            recyclerView = (RecyclerView) itemView.findViewById(R.id.rv_wait_show_recycle2);

        }

        @Override
        public void setData(List<ScrollViewBean2.DataBean.ComingBean> scrollComingBeans) {
            recyclerView.setAdapter(new WaitShowScroll2Adapter(mContext,scrollComingBeans));
            LinearLayoutManager manager = new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
            recyclerView.setLayoutManager(manager);

        }
    }

    private class RECYCLEVIEWHolder extends BaseViewHolder<List<RecycleViewBean.DataBean.ComingBean>> {

        private RecyclerView recyclerView;
        public RECYCLEVIEWHolder(View view, Context mContext) {
            super(view,mContext);
        }

        @Override
        public void initView() {
            recyclerView = (RecyclerView) itemView.findViewById(R.id.ll_wait_show_recycle3);

        }

        @Override
        public void setData(List<RecycleViewBean.DataBean.ComingBean> recycleComingBeans) {
            WaitShowListViewAdapter adapter = new WaitShowListViewAdapter(mContext,recycleComingBeans);

            recyclerView.setAdapter(adapter);

            LinearLayoutManager manager = new LinearLayoutManager(mContext);
            recyclerView.setLayoutManager(manager);

        }
    }
}
