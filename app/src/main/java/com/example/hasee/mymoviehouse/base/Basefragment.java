package com.example.hasee.mymoviehouse.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hasee.mymoviehouse.ui.LoadingPage;

import butterknife.ButterKnife;

/**
 * Created by lzq on 2016/11/21.
 */
public abstract  class Basefragment extends Fragment {
    public LoadingPage loadingPage;
    public Context mContext;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         loadingPage = new LoadingPage(mContext) {
            @Override
            protected String url() {

                return getUrl();
            }
            @Override
            protected View getView() {
                return initView();
            }
            @Override
            protected void progressData(String response) {
                getProgressData(response);
            }
        };
        loadingPage.getDataFromNet();
        return loadingPage;
    }

    protected abstract View initView();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();

    }

    protected  void initData(){

    }

    protected abstract String getUrl();






    protected abstract void getProgressData(String response);

}
