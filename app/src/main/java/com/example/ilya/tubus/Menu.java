package com.example.ilya.tubus;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;


public class Menu extends AppCompatActivity {
    Button bt1,bt2;
    ImageView logo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        logo = findViewById(R.id.Logo);
        bt1 = findViewById(R.id.Theory);
        bt2 = findViewById(R.id.Practise);

        bt1.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, List_of_theory.class);
            startActivity(intent);
        });
        bt2.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, List_of_practise.class);
            startActivity(intent);
        });
    }
}