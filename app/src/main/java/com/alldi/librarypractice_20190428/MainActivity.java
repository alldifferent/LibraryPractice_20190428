package com.alldi.librarypractice_20190428;


import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.alldi.librarypractice_20190428.databinding.ActivityMainBinding;
import com.bumptech.glide.Glide;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupEvents();
        bindViews();
        setValues();

    }


    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        Glide.with(mContext).load("https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2").into(act.pizzahutImg);

    }

    @Override
    public void bindViews() {

        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }
}
