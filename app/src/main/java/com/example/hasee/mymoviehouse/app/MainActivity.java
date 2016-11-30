package com.example.hasee.mymoviehouse.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.base.Basefragment;
import com.example.hasee.mymoviehouse.cinema.fragment.CinemaFragment;
import com.example.hasee.mymoviehouse.find.fragment.FindFragment;
import com.example.hasee.mymoviehouse.movie.fragment.MovieFragment;
import com.example.hasee.mymoviehouse.my.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

    @Bind(R.id.frameLayout)
    FrameLayout frameLayout;
    @Bind(R.id.rb_movie)
    RadioButton rbMovie;
    @Bind(R.id.rb_cinema)
    RadioButton rbCinema;
    @Bind(R.id.rb_find)
    RadioButton rbFind;
    @Bind(R.id.rb_my)
    RadioButton rbMy;
    @Bind(R.id.rg_main)
    RadioGroup rgMain;

    private int position;
    private List<Fragment> fragments;
    private Basefragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initFragment();
        initListener();
    }

    private void initListener() {
        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){

                    case R.id.rb_movie:
                        position = 0;
                        break;
                    case R.id.rb_cinema:
                        position = 1;
                        break;
                    case R.id.rb_find:
                        position = 2;
                        break;
                    case R.id.rb_my:
                        position = 3;

                        break;

                }

                Basefragment toFragment = (Basefragment) fragments.get(position);
                changeFragment(fragment,toFragment);
            }

        });
        rgMain.check(R.id.rb_movie);
    }

    private void changeFragment(Basefragment fromFragment, Basefragment toFragment) {
        if(toFragment!=fromFragment) {
            if(toFragment!=null) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();



                if(!toFragment.isAdded()) {
                    transaction.add(R.id.frameLayout,toFragment).commit();
                    if(fromFragment!=null) {
                        transaction.hide(fromFragment);
                    }
                }else {
                    transaction.show(toFragment).commit();
                    if(fromFragment!=null) {
                        transaction.hide(fromFragment);
                    }
                }
                fragment= toFragment;
            }
        }
    }

    private void initFragment() {
        fragments = new ArrayList<Fragment>();
        MovieFragment movieFragment = new MovieFragment();
        CinemaFragment cinemaFragment = new CinemaFragment();
        FindFragment  findFragment = new FindFragment();
        MyFragment myFragment = new MyFragment();

        fragments.add(movieFragment);
        fragments.add(cinemaFragment);
        fragments.add(findFragment);
        fragments.add(myFragment);
    }
}
