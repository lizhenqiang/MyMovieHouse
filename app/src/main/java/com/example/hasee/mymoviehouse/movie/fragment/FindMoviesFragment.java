package com.example.hasee.mymoviehouse.movie.fragment;

import android.view.View;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;

/**
 * Created by lzq on 2016/11/30.
 */
public class FindMoviesFragment extends Basefragment {
    @Override
    public View initView() {
        View view = View.inflate(mContext,R.layout.fragment_find_movies,null);
        return view;
    }

    @Override
    protected String getUrl() {
        return null;
    }

    @Override
    protected void getProgressData(String response) {

    }
}
