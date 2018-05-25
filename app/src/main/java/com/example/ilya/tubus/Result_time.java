package com.example.ilya.tubus;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Result_time extends AppCompatActivity {
    ImageView emotions;
    ImageButton bthelp;
    Button bYes, bNo;
    TextView tMark, tRight,tFail,tTime;
    String  ymark,sRight,sFail,sTime;
    int time,ans;
    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_time);

        bthelp = findViewById(R.id.Help);
        emotions = findViewById(R.id.Emotion);
        bYes = findViewById(R.id.Yes);
        bNo = findViewById(R.id.No);
        tMark = findViewById(R.id.Mark);
        tRight = findViewById(R.id.Right);
        tFail = findViewById(R.id.Fail);
        tTime = findViewById(R.id.Time);

        sRight = getIntent().getStringExtra("Right");
        sFail = getIntent().getStringExtra("Fail");
        sTime = getIntent().getStringExtra("Time");


            tRight.setText(""+getIntent().getStringExtra("Right"));
            tFail.setText("" + getIntent().getStringExtra("Fail"));
            tTime.setText("" + getIntent().getStringExtra("Time") + " секунд");

            try { ans = Integer.parseInt(getIntent().getStringExtra("Right")); } catch (Exception e) { ans = 0; }
            try { time = Integer.parseInt(getIntent().getStringExtra("Time")); } catch (Exception e) { time = 0; }

            ymark = "2";

            if (ans == 20 && time < 140 ) {
                ymark = "5";
                tMark.setText(ymark);
                emotions.setImageResource(R.drawable.mark5);
            }else {
                if (ans > 16 && time < 160) {
                    ymark = "4";
                    tMark.setText(ymark);
                    emotions.setImageResource(R.drawable.mark4);
                }else {
                    if ( ans > 12 && time < 200) {
                        ymark = "3";
                        tMark.setText(ymark);
                        emotions.setImageResource(R.drawable.mark3);
                    }else{
                        ymark = "2";
                        tMark.setText(ymark);
                        emotions.setImageResource(R.drawable.mark2);
                    }
                }
            }
        bthelp.setOnClickListener(v -> {
            ad = new AlertDialog.Builder(Result_time.this);
            ad.setTitle("Как расчитывается оценка");
            ad.setMessage("5 дается за отсутствие ошибок и выполнения задания менее чем за 140 секунд.\n"+
                    "4 дается за допуск от 1 до 3 ошибок и выполнения задания менее чем за 160 секунд.\n"+
                    "3 дается за допуск от 4 до 7 ошибок и выполнения задания менее чем за 200 секунд.\n"+
                    "2 дается за допуск больше 8 ошибок или выполнения задания более чем за 200 секунд.\n"
            );
            ad.setNegativeButton("Хорошо", (dialog, i) -> {
            });
            ad.show();
        });
        bYes.setOnClickListener(v -> {
            Intent intent = new Intent(Result_time.this, Time.class);
            startActivity(intent);
        });
        bNo.setOnClickListener(v -> {
            Intent intent = new Intent(Result_time.this, Menu.class);
            startActivity(intent);
        });
    }
}
