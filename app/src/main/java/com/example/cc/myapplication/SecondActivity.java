package com.example.cc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by CC on 2017/2/3.
 */

public class SecondActivity  extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);
        Button b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);
        Button b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(this);
        Button b6=(Button) findViewById(R.id.create_database);
        b6.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.button3:
                    startActivity(new Intent(SecondActivity.this,MainActivity.class));
                case R.id.button4:
                    startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                case  R.id.button5:
                    startActivity(new Intent(SecondActivity.this,FourActivity.class));
                case R.id.create_database:
                    startActivity(new Intent(SecondActivity.this,TaskActivity.class));
                default:
                    break;
        }
    }}

