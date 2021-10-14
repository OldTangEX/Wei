package com.example.wei;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageButton mWeiXinImg;
    private ImageButton mAddressImg;
    private ImageButton mFrdImg;
    private ImageButton mSettingImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhu);
        mWeiXinImg = findViewById(R.id.wei);
        mAddressImg = findViewById(R.id.tong);
        mFrdImg = findViewById(R.id.fa);
        mSettingImg = findViewById(R.id.wo);
    }


    private void resetImg() {
        mWeiXinImg.setImageResource(R.drawable.wei);
        mAddressImg.setImageResource(R.drawable.txl);
        mFrdImg.setImageResource(R.drawable.fx);
        mSettingImg.setImageResource(R.drawable.w);
    }

}