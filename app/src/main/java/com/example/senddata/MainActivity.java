package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeActivitybtn = findViewById(R.id.bt_send);
        changeActivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
    }
        public void sendData(){
            Intent intent = new Intent(this,MainActivity.class);
            EditText editText = findViewById(R.id.et_name);
            String name = editText.getText().toString();
            intent.putExtra("Message",name); // Message is the id which will be used in actiivity2
            startActivity(intent);

        }
    }

