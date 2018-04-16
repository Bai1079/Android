package com.example.user.b10509038_hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_input;
    Button bt_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input=(EditText)findViewById(R.id.et_input);
        bt_show=(Button)findViewById(R.id.btn_show);

        bt_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("input",et_input.getText().toString());
                startActivity(intent);
            }

        });
    }
}
