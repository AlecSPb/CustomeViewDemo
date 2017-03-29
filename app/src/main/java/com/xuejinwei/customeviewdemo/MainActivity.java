package com.xuejinwei.customeviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xuejinwei.customeviewdemo.Activity.ClorkActivity;
import com.xuejinwei.customeviewdemo.Activity.CreditActivity;
import com.xuejinwei.customeviewdemo.Activity.NumberProgressBarActivity;
import com.xuejinwei.customeviewdemo.Activity.PieActivity;
import com.xuejinwei.customeviewdemo.Path.PathActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnNumberProgressbar, mBtnClork, mBtnCredit, mBtnPie, mBtnBezier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnNumberProgressbar = (Button) findViewById(R.id.btn_number_progressbar);
        mBtnClork = (Button) findViewById(R.id.btn_clork);
        mBtnCredit = (Button) findViewById(R.id.btn_credit);
        mBtnPie = (Button) findViewById(R.id.btn_pie);
        mBtnBezier = (Button) findViewById(R.id.btn_bezier);

        mBtnNumberProgressbar.setOnClickListener(this);
        mBtnClork.setOnClickListener(this);
        mBtnCredit.setOnClickListener(this);
        mBtnPie.setOnClickListener(this);
        mBtnBezier.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_number_progressbar:
                startActivity(new Intent(this, NumberProgressBarActivity.class));
                break;
            case R.id.btn_clork:
                startActivity(new Intent(this, ClorkActivity.class));
                break;
            case R.id.btn_credit:
                startActivity(new Intent(this, CreditActivity.class));
                break;
            case R.id.btn_pie:
                startActivity(new Intent(this, PieActivity.class));
                break;
            case R.id.btn_bezier:
                startActivity(new Intent(this, PathActivity.class));
                break;
            default:
                break;
        }
    }
}
