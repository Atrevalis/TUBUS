package com.example.ilya.tubus;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Result extends AppCompatActivity {
    ImageView emotion;
    ImageButton bthelp;
    Button btYes, btNo;
    TextView tmark, ttry, ttime;
    String time, yTry, mark, stime;
    int intTime, intTry;
    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        bthelp = findViewById(R.id.Help);
        emotion = findViewById(R.id.Emotion);
        btYes = findViewById(R.id.Yes);
        btNo = findViewById(R.id.No);
        tmark = findViewById(R.id.Mark);
        ttry = findViewById(R.id.Try);
        ttime = findViewById(R.id.Time);

        yTry = getIntent().getStringExtra("Try");
        time = getIntent().getStringExtra("Time");
        stime = time + " секунд";
        intTime = Integer.parseInt(time);

        ttime.setText(stime);
        ttry.setText(yTry);

        intTry = Integer.parseInt(yTry);

        mark = "2";

        if (intTry == 1 && intTime < 26) {
            mark = "5";
            tmark.setText(mark);
            emotion.setImageResource(R.drawable.mark5);
        }
        if (intTry < 3 && intTime < 31 ) {
            mark = "4";
            tmark.setText(mark);
            emotion.setImageResource(R.drawable.mark4);
        }
        if (intTry < 5 && intTime < 41 ) {
            mark = "3";
            tmark.setText(mark);
            emotion.setImageResource(R.drawable.mark3);
        }
        if (intTry >= 5 || intTime > 40) {
            mark = "2";
            tmark.setText(mark);
            emotion.setImageResource(R.drawable.mark2);
        }

        bthelp.setOnClickListener(v -> {
            ad = new AlertDialog.Builder(Result.this);
            ad.setTitle("Как расчитывается оценка");
            ad.setMessage("5 дается за использование только одной попытки и выполнения задания менее чем за 25 секунд.\n"+
            "4 дается за использование менее трех попыток и выполнения задания менее чем за 30 секунд.\n"+
            "3 дается за использование менее 5 попыток и выполнения задания менее чем за 40 секунд.\n"+
            "2 дается за использование более 4 попыток или выполнения задания более чем за 40 секунд.\n"
            );
            ad.setNegativeButton("Хорошо", (dialog, i) -> {
            });
            ad.show();
                });
        btYes.setOnClickListener(v -> {
            Intent intent = new Intent(Result.this, Dzen.class);
            startActivity(intent);
        });
        btNo.setOnClickListener(v -> {
            Intent intent = new Intent(Result.this, Menu.class);
            startActivity(intent);
        });

    }

}
