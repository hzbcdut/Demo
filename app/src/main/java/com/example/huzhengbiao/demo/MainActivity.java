package com.example.huzhengbiao.demo;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final Object TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);

        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        tv.startAnimation(anim);

        View root = findViewById(R.id.root);
        root.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View v) {
                Log.d("debug", TAG + "-->onViewAttachedToWindow(View v)");
            }

            @Override
            public void onViewDetachedFromWindow(View v) {
                Log.d("debug", TAG + "-->onViewDetachedFromWindow(View v)");
            }
        });
        // View 什么关联到窗口   自定义View的onDetachFromWindow什么时候会被调用。

        // 开始动画 和取消动画  onActivity的onStart开始动画， 在onStop取消动画
    }
}
