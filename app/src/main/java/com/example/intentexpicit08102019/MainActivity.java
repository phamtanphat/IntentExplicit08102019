package com.example.intentexpicit08102019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString, btnIntentInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);
        btnIntentInt = findViewById(R.id.buttonIntentInt);

        btnIntentString.setOnClickListener(v -> {
            // statement
            sendIntent(Appconst.KEY_STRING, "Hello main 2");
        });
        btnIntentInt.setOnClickListener(v -> {
//            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//            intent.putExtra(Appconst.KEY_INT, 123456);
//            startActivity(intent);
            Bundle bundle = new Bundle();
            bundle.putString(Appconst.KEY_STRING, "Hello main 2");
            bundle.putInt(Appconst.KEY_INT, 123456);
            sendIntent(Appconst.KEY_INT, bundle);
        });
    }
    private <T> void sendIntent(String key , T value){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        if (value instanceof Bundle){
            intent.putExtra(key,(Bundle) value);
        }
        if (value instanceof Integer){
            intent.putExtra(key ,(Integer) value);
        }

        startActivity(intent);
    }

}
