package com.example.ilya.tubus;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Most extends AppCompatActivity {
    TextView t1, t2, t3, t4;
    Button bt1, bt2, bt3;
    Character character;
    ImageButton bthelp;
    AlertDialog.Builder ad;
    Examples examples;
    int count;
    int mark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most);
        count = 0;
        character = new Character();
        examples = new Examples();
        bthelp = findViewById(R.id.Help);
        bt1 = findViewById(R.id.More);
        bt2 = findViewById(R.id.Less);
        bt3 = findViewById(R.id.Equal);
        try {
            go();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bt1.setOnClickListener(v -> {
            character.countR += examples.expression[character.current_expression].directions[0].RightNumber;
            if (examples.expression[character.current_expression].directions[0].RightNumber == 0){character.countF ++;}
            try {
                go();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        bt2.setOnClickListener(v -> {

            character.countR += examples.expression[character.current_expression].directions[1].RightNumber;
            if (examples.expression[character.current_expression].directions[1].RightNumber == 0){character.countF ++;}
            try {
                go();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        bt3.setOnClickListener(v -> {
            character.countR += examples.expression[character.current_expression].directions[2].RightNumber;
            if (examples.expression[character.current_expression].directions[2].RightNumber == 0){character.countF ++;}
            try {
                go();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });
        bthelp.setOnClickListener(v -> {
            ad = new AlertDialog.Builder(Most.this);
            ad.setTitle("Как расчитывается оценка");
            ad.setMessage("5 дается за все правильные ответы.\n"+
                    "4 дается за допуск от 1 до 4 ошибок.\n"+
                    "3 дается за допуск от 5 до 8 ошибок.\n"+
                    "2 дается за допуск более 9 ошибок.\n"
            );
            ad.setNegativeButton("Хорошо", (dialog, i) -> {
            });
            ad.show();
        });
    }

    void go() throws InterruptedException {
        t4 = findViewById(R.id.Example);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t3.setText("  Количество неправильных ответов: " + character.countF);
        t2.setText("  Количество правильных ответов: " + character.countR);
        character.current_expression = (int) (Math.random() * 20);
        t4.setText((examples.expression[character.current_expression].example));
        count++;
        if (count == 21) {
            if (character.countR == 20) {
                mark = 5;
            } else {
                if (character.countR < 20 && character.countR > 15) {
                    mark = 4;
                } else {
                    if (character.countR < 16 && character.countR > 11) {
                        mark = 3;
                    } else {
                        if (character.countR < 12) {
                            mark = 2;
                        }
                    }
                }
            }
            t4.setText(("Ваша оценка: " + mark));
            bt1.setClickable(false);
            bt2.setClickable(false);
            bt3.setClickable(false);
            }
        }

    }

