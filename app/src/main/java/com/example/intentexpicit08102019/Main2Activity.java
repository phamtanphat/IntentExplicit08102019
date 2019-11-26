package com.example.intentexpicit08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // 1 : Nhận dạng String
        Intent intent = getIntent();
        String chuoi = intent.getStringExtra("chuoi");
        Log.d("BBB",chuoi);
    }
}
