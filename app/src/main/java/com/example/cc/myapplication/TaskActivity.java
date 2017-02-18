package com.example.cc.myapplication;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by CC on 2017/2/14.
 */

public class TaskActivity extends AppCompatActivity  implements View.OnClickListener {
    private EditText editText;
    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_activity);
        Button addData = (Button) findViewById(R.id.button6);
        editText = (EditText) findViewById(R.id.edit_text);
        addData.setOnClickListener(this);
    }
        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.button6:
                    String things = editText.getText().toString();
                    SQLiteDatabase db=dbHelper.getWritableDatabase();
                    ContentValues values=new ContentValues();
                    values.put("事件", things);
                    long time= System.currentTimeMillis();
                   values.put("时间",time);
                    db.insert("Book",null,values);
                    break;
                default:
                    break;
            }

        }
    }