package com.example.hasee.mymoviehouse.movie.fragment;

import android.view.View;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;

/**
 * Created by lzq on 2016/11/30.
 */
public class HotShowFragment extends Basefragment {
    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragement_hot_show,null);
        return view;
    }
}
