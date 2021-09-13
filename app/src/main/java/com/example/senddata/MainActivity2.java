package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       TextView textView2 = findViewById(R.id.tv_activity2);
       String yourname = getIntent().getStringExtra("Message");
       textView2.setText(yourname);
    }
}