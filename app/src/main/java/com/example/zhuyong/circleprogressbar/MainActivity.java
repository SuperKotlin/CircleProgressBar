package com.example.zhuyong.circleprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleProgressBar mCircleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCircleProgressView = (CircleProgressBar) findViewById(R.id.circle_view);
        mCircleProgressView.start();
    }
}
