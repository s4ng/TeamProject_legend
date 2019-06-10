package com.example.bank_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class SubActivity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView id = findViewById(R.id.text_userid);
        Intent intent = getIntent();
        id.setText(intent.getStringExtra("key"));

        Button btn_transfer = findViewById(R.id.btn_transfer);

        btn_transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TransferActivity_1.class);
                startActivity(i);
            }
        });
    }
}
