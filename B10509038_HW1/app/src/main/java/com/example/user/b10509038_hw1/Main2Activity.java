package com.example.user.b10509038_hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        String input=intent.getStringExtra("input");

        tv_result=(TextView)findViewById(R.id.tv_result);
        tv_result.setText("你的學號：" + input);
    }
}
