package com.example.ilya.tubus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Fight extends AppCompatActivity {
    Button bt11, bt12, bt13, bt21, bt22, bt23;
    TextView ex1, ex2, point1, point2;
    int count_point1, count_point2, mult1, mult2, op, numBt, numf1, numf2, i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fight);
        bt11 = findViewById(R.id.button11);
        bt12 = findViewById(R.id.button12);
        bt13 = findViewById(R.id.button13);
        bt21 = findViewById(R.id.button21);
        bt22 = findViewById(R.id.button22);
        bt23 = findViewById(R.id.button23);
        ex1 = findViewById(R.id.Example1);
        ex2 = findViewById(R.id.Example2);
        point1 = findViewById(R.id.Point1);
        point2 = findViewById(R.id.Point2);
        count_point1 = 0;
        count_point2 = 0;
        i = 0;
        point1.setText(count_point1 + " очков из 10");
        point2.setText(count_point2 + " очков из 10");

        set();
        bt11.setOnClickListener(v -> {
            if (numBt == 0) {
                count_point1++;
                setEnabledFalse();

                point1.setText(count_point1 + " очков из 10");
                if (count_point1 == 10) {
                    setTextSize();
                    winPlayerOne();
                } else {
                    set();
                    setEnabledTrue();
                }
            } else {
                i++;
                if (count_point1 == 0) {
                    count_point1 = 0;
                } else {
                    count_point1--;
                }
                point1.setText(count_point1 + " очков из 10");
                bt11.setEnabled(false);
                bt12.setEnabled(false);
                bt13.setEnabled(false);
                if (i > 1) {
                    set();
                    setEnabledTrue();
                    i = 0;
                }
            }
        });
        bt12.setOnClickListener(v -> {
            if (numBt == 1) {
                count_point1++;
                setEnabledFalse();

                point1.setText(count_point1 + " очков из 10");
                if (count_point1 == 10) {
                    setTextSize();
                    winPlayerOne();
                } else {
                    set();
                    setEnabledTrue();
                }
            } else {
                i++;
                if (count_point1 == 0) {
                    count_point1 = 0;
                } else {
                    count_point1--;
                }
                point1.setText(count_point1 + " очков из 10");
                bt11.setEnabled(false);
                bt12.setEnabled(false);
                bt13.setEnabled(false);
                if (i > 1) {
                    set();
                    setEnabledTrue();
                    i = 0;
                }
            }
        });
        bt13.setOnClickListener(v -> {
            if (numBt == 2) {
                count_point1++;
                setEnabledFalse();

                point1.setText(count_point1 + " очков из 10");
                if (count_point1 == 10) {
                    setTextSize();
                    winPlayerOne();
                } else {
                    set();
                    setEnabledTrue();
                }
            } else {
                i++;
                if (count_point1 == 0) {
                    count_point1 = 0;
                } else {
                    count_point1--;
                }
                point1.setText(count_point1 + " очков из 10");
                bt11.setEnabled(false);
                bt12.setEnabled(false);
                bt13.setEnabled(false);
                if (i > 1) {
                    set();
                    setEnabledTrue();
                    i = 0;
                }
            }
        });
        bt21.setOnClickListener(v -> {
            if (numBt == 0) {
                count_point2++;
                setEnabledFalse();

                point2.setText(count_point2 + " очков из 10");
                if (count_point2 == 10) {
                    setTextSize();
                    winPlayerTwo();
                } else {
                    set();
                    setEnabledTrue();
                }
            } else {
                i++;
                if (count_point2 == 0) {
                    count_point2 = 0;
                } else {
                    count_point2--;
                }
                point2.setText(count_point2 + " очков из 10");
                bt21.setEnabled(false);
                bt22.setEnabled(false);
                bt23.setEnabled(false);
                if (i > 1) {
                    set();
                    setEnabledTrue();
                    i = 0;
                }
            }
        });
        bt22.setOnClickListener(v -> {
            if (numBt == 1) {
                count_point2++;
                setEnabledFalse();

                point2.setText(count_point2 + " очков из 10");
                if (count_point2 == 10) {
                    setTextSize();
                    winPlayerTwo();
                } else {
                    set();
                    setEnabledTrue();
                }
            } else {
                i++;
                if (count_point2 == 0) {
                    count_point2 = 0;
                } else {
                    count_point2--;
                }
                point2.setText(count_point2 + " очков из 10");
                bt21.setEnabled(false);
                bt22.setEnabled(false);
                bt23.setEnabled(false);
                if (i > 1) {
                    set();
                    setEnabledTrue();
                    i = 0;
                }
            }
        });
        bt23.setOnClickListener(v -> {
            if (numBt == 2) {
                count_point2++;
                setEnabledFalse();

                point2.setText(count_point2 + " очков из 10");
                if (count_point2 == 10) {
                    setTextSize();
                    winPlayerTwo();
                } else {
                    set();
                    setEnabledTrue();
                }
            } else {
                i++;
                if (count_point2 == 0) {
                    count_point2 = 0;
                } else {
                    count_point2--;
                }
                point2.setText(count_point2 + " очков из 10");
                bt21.setEnabled(false);
                bt22.setEnabled(false);
                bt23.setEnabled(false);
                if (i > 1) {
                    set();
                    setEnabledTrue();
                    i = 0;
                }
            }
        });
    }

    void set() {
        mult1 = (int) (Math.random() * 11);
        mult2 = (int) (Math.random() * 11);
        op = mult1 * mult2;
        ex1.setText(mult1 + " X " + mult2 + " = ?");
        ex2.setText(mult1 + " X " + mult2 + " = ?");
        numBt = (int) (Math.random() * 3);
        if (numBt == 0) {
            bt11.setText("" + op);
            bt21.setText("" + op);
            numf1 = (int) (Math.random() * 101);
            while (numf1 == op) {
                numf1 = (int) (Math.random() * 101);
            }
            bt12.setText("" + numf1);
            bt22.setText("" + numf1);
            numf2 = (int) (Math.random() * 101);
            while (numf2 == op || numf2 == numf1) {
                numf2 = (int) (Math.random() * 101);
            }
            bt13.setText("" + numf2);
            bt23.setText("" + numf2);

        }
        if (numBt == 1) {
            bt12.setText("" + op);
            bt22.setText("" + op);
            numf1 = (int) (Math.random() * 101);
            while (numf1 == op) {
                numf1 = (int) (Math.random() * 101);
            }
            bt11.setText("" + numf1);
            bt21.setText("" + numf1);
            numf2 = (int) (Math.random() * 101);
            while (numf2 == op || numf2 == numf1) {
                numf2 = (int) (Math.random() * 101);
            }
            bt13.setText("" + numf2);
            bt23.setText("" + numf2);
        }
        if (numBt == 2) {
            bt13.setText("" + op);
            bt23.setText("" + op);
            numf1 = +(int) (Math.random() * 101);
            while (numf1 == op) {
                numf1 = (int) (Math.random() * 101);
            }
            bt12.setText("" + numf1);
            bt22.setText("" + numf1);
            numf2 = (int) (Math.random() * 101);
           while(numf2 == op || numf2 == numf1) {
                numf2 = (int) (Math.random() * 101);
            }
            bt11.setText("" + numf2);
            bt21.setText("" + numf2);
        }
    }

    void setEnabledFalse() {
        bt11.setEnabled(false);
        bt12.setEnabled(false);
        bt13.setEnabled(false);
        bt21.setEnabled(false);
        bt22.setEnabled(false);
        bt23.setEnabled(false);
    }

    void setEnabledTrue() {
        bt11.setEnabled(true);
        bt12.setEnabled(true);
        bt13.setEnabled(true);
        bt21.setEnabled(true);
        bt22.setEnabled(true);
        bt23.setEnabled(true);
    }

    void setTextSize() {
        bt11.setTextSize(17);
        bt12.setTextSize(17);
        bt13.setTextSize(17);
        bt21.setTextSize(17);
        bt22.setTextSize(17);
        bt23.setTextSize(17);
    }

    void setClickableFalse(){
        bt11.setClickable(false);
        bt12.setClickable(false);
        bt13.setClickable(false);
        bt21.setClickable(false);
        bt22.setClickable(false);
        bt23.setClickable(false);
    }

    void winPlayerOne() {
        setClickableFalse();
        setEnabledTrue();
        bt11.setText("Вы");
        bt12.setText("победили");
        bt13.setText("соперника!");
        bt21.setText("Вы");
        bt22.setText("проиграли");
        bt23.setText("сопернику");
    }

    void winPlayerTwo() {
        setClickableFalse();
        setEnabledTrue();
        bt21.setText("Вы");
        bt22.setText("победили");
        bt23.setText("соперника!");
        bt11.setText("Вы");
        bt12.setText("проиграли");
        bt13.setText("сопернику");
    }
}
