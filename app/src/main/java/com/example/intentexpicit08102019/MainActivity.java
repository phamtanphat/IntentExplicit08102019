package com.example.intentexpicit08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnIntentString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntentString = findViewById(R.id.buttonIntentString);

        btnIntentString.setOnClickListener(v -> {
            // statement
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra(Appconst.KEY_STRING,"Hello main 2");
            startActivity(intent);
        });
    }
}
