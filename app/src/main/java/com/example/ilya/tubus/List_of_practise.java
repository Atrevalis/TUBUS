package com.example.ilya.tubus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;

public class List_of_practise extends AppCompatActivity {
    ImageButton btMost, btDzen,btTime,btFIGHT;
    Button btMenu;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_practise);

        btMost = findViewById(R.id.Most);
        btDzen = findViewById(R.id.Dzen);
        btTime = findViewById(R.id.Time);
        btMenu = findViewById(R.id.GO_MENU2);
        btFIGHT = findViewById(R.id.FIGHT);

        btMost.setOnClickListener(v -> {
            Intent intent = new Intent(List_of_practise.this, Most.class);
            startActivity(intent);
        });
        btDzen.setOnClickListener(v -> {
            Intent intent = new Intent(List_of_practise.this, Dzen.class);
            startActivity(intent);
        });
        btMenu.setOnClickListener(v -> {
            Intent intent = new Intent(List_of_practise.this, Menu.class);
            startActivity(intent);
        });
        btFIGHT.setOnClickListener(v -> {
            Intent intent = new Intent(List_of_practise.this, Fight.class);
            startActivity(intent);
        });
        btTime.setOnClickListener(v -> {
            Intent intent = new Intent(List_of_practise.this, Time.class);
            startActivity(intent);
        });

       }
    }