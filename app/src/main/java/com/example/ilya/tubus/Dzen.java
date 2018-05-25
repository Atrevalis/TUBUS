package com.example.ilya.tubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Dzen extends AppCompatActivity {
    Button X1, X2, X3, X4, X5, X6, X7, X8, X9, menu;
    int position;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzen);
        X1 = findViewById(R.id.X1);
        X2 = findViewById(R.id.X2);
        X3 = findViewById(R.id.X3);
        X4 = findViewById(R.id.X4);
        X5 = findViewById(R.id.X5);
        X6 = findViewById(R.id.X6);
        X7 = findViewById(R.id.X7);
        X8 = findViewById(R.id.X8);
        X9 = findViewById(R.id.X9);
        menu = findViewById(R.id.inMenu);



        X1.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "1");
            startActivity(intent);
            finish();
        });
        X2.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "2");
            startActivity(intent);
            finish();
        });
        X3.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "3");
            startActivity(intent);
            finish();
        });
        X4.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "4");
            startActivity(intent);
            finish();
        });
        X5.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "5");
            startActivity(intent);
            finish();
        });
        X6.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "6");
            startActivity(intent);
            finish();
        });
        X7.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "7");
            startActivity(intent);
            finish();
        });
        X8.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "8");
            startActivity(intent);
            finish();
        });
        X9.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Dzen_x.class);
            intent.putExtra("Dzen", "9");
            startActivity(intent);
            finish();
        });
        menu.setOnClickListener(v -> {
            Intent intent = new Intent(Dzen.this, Menu.class);
            startActivity(intent);
            finish();
        });

    }

}
