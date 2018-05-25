package com.example.ilya.tubus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class List_of_theory extends AppCompatActivity {
    RecyclerView rv;
    Button btm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_theory);
        List<Stroke> strokes = new ArrayList<>();
        btm = findViewById(R.id.btMenu);

        strokes.add(new Stroke("Таблица умножения", "", "1"));
        strokes.add(new Stroke("Правило о перестановке множителей", "", "2"));
        strokes.add(new Stroke("Частные случаи умножения", "", "3"));
        strokes.add(new Stroke("Умножение на 9 и фокусы", "", "4"));
        strokes.add(new Stroke("Умножение на 8 и фокусы", "", "5"));
        strokes.add(new Stroke("Умножение на 7 и фокусы", "", "6"));
        strokes.add(new Stroke("Умножение на 6", "", "7"));
        strokes.add(new Stroke("Умножение на 5", "", "8"));
        strokes.add(new Stroke("Умножение на 4", "", "9"));
        strokes.add(new Stroke("Умножение на 3", "", "10"));
        strokes.add(new Stroke("Умножение на 2", "", "11"));



        rv = findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this)); // устанавливаем разметку для списка.
        rv.setItemAnimator(new DefaultItemAnimator()); //устанавливаем класс, отвечающий за анимации в списке
        rv.setAdapter(new RVAdapter(strokes, this)); //устанавливаем наш адаптер

        btm.setOnClickListener(v -> {
            Intent intent = new Intent(List_of_theory.this, Menu.class);
            startActivity(intent);
        });
    }
}
