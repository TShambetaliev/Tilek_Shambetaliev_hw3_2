package com.example.tilek_shambetaliev_hw3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    getSupportFragmentManager().beginTransaction()
            .add(R.id.conteiner, new FirstFragment()).commit();

    }
}