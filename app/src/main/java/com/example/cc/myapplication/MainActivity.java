package com.example.cc.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private MyDatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper=new MyDatabaseHelper(this,"ToDoList.db",null,2);//版本号指定为1
        Button b6=(Button) findViewById(R.id.create_database);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();//通过按钮点击建立数据库

            }
        });
        }
}