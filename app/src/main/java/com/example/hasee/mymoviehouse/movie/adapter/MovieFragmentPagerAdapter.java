package com.example.hasee.mymoviehouse.movie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by lzq on 2016/11/30.
 */
public class MovieFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] titles = new String[]{"热映", "待映","找片"};
    private List<Fragment> fragments;
    public MovieFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragments) {
        super(fragmentManager);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments==null?null:fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments==null?null:fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
