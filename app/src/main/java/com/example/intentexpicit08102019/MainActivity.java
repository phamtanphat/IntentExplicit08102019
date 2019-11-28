package com.example.intentexpicit08102019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString, btnIntentInt, btnIntentObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntentInt = findViewById(R.id.buttonIntentInt);
        btnIntentObject = findViewById(R.id.buttonIntentObject);

        btnIntentString.setOnClickListener(v -> {
            // statement
            sendIntent(Appconst.KEY_STRING, "Hello main 2");
        });
        btnIntentInt.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//            intent.putExtra(Appconst.KEY_INT, 123456);
//            startActivity(intent);
            sendIntent(Appconst.KEY_INT, 123456);
        });
        btnIntentObject.setOnClickListener(v -> {
            Sinhvien sinhvien = new Sinhvien("Nguyen Van A", "20");
//            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//            intent.putExtra(Appconst.KEY_OBJECT,  sinhvien);
//            startActivity(intent);
            sendIntent(Appconst.KEY_OBJECT,  sinhvien);
        });

//        -Task : đưa object sang cho generic
//        -Task : chuyển dạng mảng object
    }
    private <T> void sendIntent(String key , T value){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        if (value instanceof Bundle){
            intent.putExtra(key,(Bundle) value);
        }
        if (value instanceof Integer){
            intent.putExtra(key ,(Integer) value);
        }
        if (value instanceof Sinhvien){
            intent.putExtra(key ,(Serializable) value);
        }

        startActivity(intent);
    }

}
