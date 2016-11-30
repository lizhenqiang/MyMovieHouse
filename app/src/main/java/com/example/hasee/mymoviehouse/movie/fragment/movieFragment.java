package com.example.hasee.mymoviehouse.movie.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;
import com.example.hasee.mymoviehouse.movie.adapter.MovieFragmentPagerAdapter;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lzq on 2016/11/30.
 */
public class MovieFragment extends Basefragment {


    @Bind(R.id.tv_city)
    TextView tvCity;
    @Bind(R.id.slidingtablayout)
    SlidingTabLayout slidingtablayout;
    @Bind(R.id.ib_search)
    ImageButton ibSearch;
    @Bind(R.id.view_pager)
    ViewPager viewPager;
    private List<Fragment> fragmets;
    private MovieFragmentPagerAdapter movieFragmentPagerAdapter;
    private String[] titles = new String[]{"热映", "待映","找片"};

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_movie, null);

        ButterKnife.bind(this, view);


        return view;
    }

    @Override
    public void initData() {

        initFragments();

       // viewPager.setAdapter(movieFragmentPagerAdapter);
        slidingtablayout.setViewPager(viewPager,titles,getActivity(), (ArrayList<Fragment>) fragmets);
        //pagerTabLayout.setupWithViewPager(viewPager);

    }

    private void initFragments() {
        fragmets = new ArrayList<>();
        FindMoviesFragment findMoviesFragment = new FindMoviesFragment();
        HotShowFragment hotShowFragment = new HotShowFragment();
        WaitShowFragment waitShowFragment = new WaitShowFragment();
        fragmets.add(findMoviesFragment);
        fragmets.add(hotShowFragment);
        fragmets.add(waitShowFragment);
    }


}
