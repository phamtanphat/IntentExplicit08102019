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
        Intent intent = getIntent();
        Bundle number = intent.getBundleExtra(Appconst.KEY_INT);
        Log.d("BBB",number.getString(Appconst.KEY_STRING) + "");
        Log.d("BBB",number.getInt(Appconst.KEY_INT) + "");
    }
}
