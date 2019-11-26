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
//        Intent intent = getIntent();
//        String chuoi = intent.getStringExtra(Appconst.KEY_STRING);
//        Log.d("BBB",chuoi);
//        2 : Nhân dạng int
//        Intent intent = getIntent();
//        int number = intent.getIntExtra(Appconst.KEY_INT,Integer.MIN_VALUE);
//        Log.d("BBB",number + "");
//        3 : Nhận dang object
        Intent intent = getIntent();
        Sinhvien sinhvien = (Sinhvien) intent.getSerializableExtra(Appconst.KEY_OBJECT);
        Log.d("BBB",sinhvien.name);
    }
}
