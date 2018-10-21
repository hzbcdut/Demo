package com.example.navigationbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       int navigationBarHeight =  NavigationBarUtil.getNavigationBarHeight(this);
        Log.d("debug", " --> navigationBarHeight = " + navigationBarHeight);

        NavigationBarUtil.hideBottomUIMenu(this);
    }
}
