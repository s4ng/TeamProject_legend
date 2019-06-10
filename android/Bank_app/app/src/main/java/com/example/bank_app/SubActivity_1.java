package com.example.bank_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

public class SubActivity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView id = findViewById(R.id.text_userid);
        Intent intent = getIntent();
        id.setText(intent.getStringExtra("id"));
    }
}
