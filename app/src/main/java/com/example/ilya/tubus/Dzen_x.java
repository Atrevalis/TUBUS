package com.example.ilya.tubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Dzen_x extends AppCompatActivity {
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9;
    Button bt1;
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9;
    EditText et1, et2, et3, et4, et5, et6, et7, et8, et9;
    int i1, i2, i3, i4, i5, i6, i7, i8, i9, ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, count_try, wrong, count_right;
    long start_time, finish_time, time;
    String s1, s2, s3, s4, s5, s6, s7, s8, s9, scountTry, stime;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzen_x);

        wrong = 0;
        count_try = 0;

        start_time = System.currentTimeMillis();
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        iv7 = findViewById(R.id.iv7);
        iv8 = findViewById(R.id.iv8);
        iv9 = findViewById(R.id.iv9);

        iv1.setVisibility(View.GONE);
        iv2.setVisibility(View.GONE);
        iv3.setVisibility(View.GONE);
        iv4.setVisibility(View.GONE);
        iv5.setVisibility(View.GONE);
        iv6.setVisibility(View.GONE);
        iv7.setVisibility(View.GONE);
        iv8.setVisibility(View.GONE);
        iv9.setVisibility(View.GONE);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);

        bt1 = findViewById(R.id.bt1);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);
        et9 = findViewById(R.id.et9);
        set();

        bt1.setOnClickListener((View v) -> {
            count_try++;
            s1 = getS1();
            s2 = getS2();
            s3 = getS3();
            s4 = getS4();
            s5 = getS5();
            s6 = getS6();
            s7 = getS7();
            s8 = getS8();
            s9 = getS9();

            try { i1 = Integer.parseInt(s1); } catch (Exception e) { i1 = 0; }
            try { i2 = Integer.parseInt(s2); } catch (Exception e) { i2 = 0; }
            try { i3 = Integer.parseInt(s3); } catch (Exception e) { i3 = 0; }
            try { i4 = Integer.parseInt(s4); } catch (Exception e) { i4 = 0; }
            try { i5 = Integer.parseInt(s5); } catch (Exception e) { i5 = 0; }
            try { i6 = Integer.parseInt(s6); } catch (Exception e) { i6 = 0; }
            try { i7 = Integer.parseInt(s7); } catch (Exception e) { i7 = 0; }
            try { i8 = Integer.parseInt(s8); } catch (Exception e) { i8 = 0; }
            try { i9 = Integer.parseInt(s9); } catch (Exception e) { i9 = 0; }

            ans1 = Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans2 = 2 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans3 = 3 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans4 = 4 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans5 = 5 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans6 = 6 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans7 = 7 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans8 = 8 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            ans9 = 9 * Integer.parseInt(getIntent().getStringExtra("Dzen"));
            count_right = 0;


            if (i1 == ans1) {
                count_right++;
                iv1.setImageResource(R.drawable.green);
                iv1.setVisibility(View.VISIBLE);
            }else{
                iv1.setImageResource(R.drawable.red);
                iv1.setVisibility(View.VISIBLE);
            }
            if (i2 == ans2) {
                count_right++;
                iv2.setImageResource(R.drawable.green);
                iv2.setVisibility(View.VISIBLE);
            }else{
                iv2.setImageResource(R.drawable.red);
                iv2.setVisibility(View.VISIBLE);
            }
            if (i3 == ans3) {
                count_right++;
                iv3.setImageResource(R.drawable.green);
                iv3.setVisibility(View.VISIBLE);
            }else{
                iv3.setImageResource(R.drawable.red);
                iv3.setVisibility(View.VISIBLE);
            }
            if (i4 == ans4) {
                count_right++;
                iv4.setImageResource(R.drawable.green);
                iv4.setVisibility(View.VISIBLE);
            }else{
                iv4.setImageResource(R.drawable.red);
                iv4.setVisibility(View.VISIBLE);
            }
            if (i5 == ans5) {
                count_right++;
                iv5.setImageResource(R.drawable.green);
                iv5.setVisibility(View.VISIBLE);
            }else{
                iv5.setImageResource(R.drawable.red);
                iv5.setVisibility(View.VISIBLE);
            }
            if (i6 == ans6) {
                count_right++;
                iv6.setImageResource(R.drawable.green);
                iv6.setVisibility(View.VISIBLE);
            }else{
                iv6.setImageResource(R.drawable.red);
                iv6.setVisibility(View.VISIBLE);
            }
            if (i7 == ans7) {
                count_right++;
                iv7.setImageResource(R.drawable.green);
                iv7.setVisibility(View.VISIBLE);
            }else{
                iv7.setImageResource(R.drawable.red);
                iv7.setVisibility(View.VISIBLE);
            }
            if (i8 == ans8) {
                count_right++;
                iv8.setImageResource(R.drawable.green);
                iv8.setVisibility(View.VISIBLE);
            }else{
                iv8.setImageResource(R.drawable.red);
                iv8.setVisibility(View.VISIBLE);
            }
            if (i9 == ans9) {
                count_right++;
                iv9.setImageResource(R.drawable.green);
                iv9.setVisibility(View.VISIBLE);
            }else{
                iv9.setImageResource(R.drawable.red);
                iv9.setVisibility(View.VISIBLE);
            }
            if (count_right == 9) {
                scountTry = "" + count_try;
                finish_time = System.currentTimeMillis();
                time = finish_time - start_time;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(time);
                time = calendar.get(Calendar.SECOND);
                stime = "" + time;
                Intent intent = new Intent(Dzen_x.this, Result.class);
                intent.putExtra("Try", scountTry);
                intent.putExtra("Time", stime);
                startActivity(intent);
                
finish();

            }


        });
    }

    void set() {
        t1.setText("1 X " + getIntent().getStringExtra("Dzen") + " = ");
        t2.setText("2 X " + getIntent().getStringExtra("Dzen") + " = ");
        t3.setText("3 X " + getIntent().getStringExtra("Dzen") + " = ");
        t4.setText("4 X " + getIntent().getStringExtra("Dzen") + " = ");
        t5.setText("5 X " + getIntent().getStringExtra("Dzen") + " = ");
        t6.setText("6 X " + getIntent().getStringExtra("Dzen") + " = ");
        t7.setText("7 X " + getIntent().getStringExtra("Dzen") + " = ");
        t8.setText("8 X " + getIntent().getStringExtra("Dzen") + " = ");
        t9.setText("9 X " + getIntent().getStringExtra("Dzen") + " = ");
    }

    String getS1() {
        return et1.getEditableText().toString();
    }

    String getS2() {
        return et2.getEditableText().toString();
    }

    String getS3() {
        return et3.getEditableText().toString();
    }

    String getS4() {
        return et4.getEditableText().toString();
    }

    String getS5() {
        return et5.getEditableText().toString();
    }

    String getS6() {
        return et6.getEditableText().toString();
    }

    String getS7() {
        return et7.getEditableText().toString();
    }

    String getS8() {
        return et8.getEditableText().toString();
    }

    String getS9() {
        return et9.getEditableText().toString();
    }
}
