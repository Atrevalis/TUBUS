package com.example.ilya.tubus;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;

public class Time extends AppCompatActivity {
    TextView tsec, example, tSolve;
    EditText edAns;
    Button btNext;
    String sAns,stime;
    Handler handler;
    int  intAns, mult1, mult2, op, rightAns,sec,time,count_try,solve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        btNext = findViewById(R.id.Next);
        tsec = findViewById(R.id.Time);
        edAns = findViewById(R.id.editExamlpe);

        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                tsec.setText(msg.what+ " секунд");
                tsec.invalidate();
                if (msg.what == 0){
                    time = 200;
                    Intent intent = new Intent(Time.this, Result_time.class);
                    intent.putExtra("Right"," ЛИМИТ");
                    intent.putExtra("Fail","ВЫ  НЕ  УЛОЖИЛИСЬ  В ");
                    intent.putExtra("Time",""+time);
                    startActivity(intent);
                }
            }
        };
        solve = -1;
        count_try = 0;
        set();
        SecondThread thread = new SecondThread();
        thread.start();
        btNext.setOnClickListener(v -> {
            sAns = getAns();
            count_try++;
            try { intAns = Integer.parseInt(sAns); } catch (Exception e) { intAns = -1; }
            if (intAns == op) {
                rightAns++;
            }
            if (count_try == 20) {
                tSolve.setText("20 из 20");
                time = 200 - sec;
                Intent intent = new Intent(Time.this, Result_time.class);
                intent.putExtra("Right",""+rightAns);
                intent.putExtra("Fail"," Правильных ответов: ");
                intent.putExtra("Time",""+time);
                startActivity(intent);
            }else{set();}

        });
    }

    class SecondThread extends Thread {
        @Override
        public void run() {
            for (int i = 200; i >= 0 ; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                if (this.isInterrupted()){
                    break;
                }else {
                    sec = i;
                    handler.sendEmptyMessage(sec);
                }
            }
        }
    }
    void set() {

        tSolve = findViewById(R.id.Solve);
        solve++;
        tSolve.setText(solve+" из 20");
        example = findViewById(R.id.Example);
        mult1 = (int) (Math.random() * 11);
        mult2 = (int) (Math.random() * 11);
        op = mult1 * mult2;
        example.setText(mult1 + " X " + mult2 + " = ");
        edAns.setText(null);
    }
    String getAns() {
        return edAns.getEditableText().toString();
    }
}
