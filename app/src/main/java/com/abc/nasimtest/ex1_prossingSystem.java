package com.abc.nasimtest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ex1_prossingSystem extends AppCompatActivity {

    String buttonValue;
    Button startButton;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimeRunning;
    private long MTimeLeft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_prossing_system);

        Intent intent= getIntent();
        buttonValue =intent.getStringExtra("value");
        int intValue =Integer.parseInt(buttonValue);

        switch (intValue){

            case 1:
                setContentView(R.layout.activity_mounatin_ex1);
                break;

            case 2:
                setContentView(R.layout.activity_basic_cr_ex2);
                break;
            case 3:
                setContentView(R.layout.activity_bench_ex3);
                break;
            case 4:
                setContentView(R.layout.activity_bicycle_ex4);
                break;

            case 5:
                setContentView(R.layout.activity_leg_raise_ex5);
                break;

            case 6:
                setContentView(R.layout.activity_hell_touch_ex6);
                break;

            case 7:
                setContentView(R.layout.activity_leg_up_ex7);
                break;
            case 8:
                setContentView(R.layout.activity_sit_up_ex8);
                break;
            case 9:
                setContentView(R.layout.activity_v_ups_ex9);
                break;
            case 10:
                setContentView(R.layout.activity_plank_rotation_ex10);
                break;
            case 11:
                setContentView(R.layout.activity_plank_leg_ex11);
                break;
            case 12:
                setContentView(R.layout.activity_russina_twist_ex12);
                break;
            case 13:
                setContentView(R.layout.activity_bridge_ex13);
                break;
            case 14:
                setContentView(R.layout.activity_vertica_leg_ex14);
                break;
            case 15:
                setContentView(R.layout.activity_wind_mill_ex15);
                break;

        }

        startButton = this.<Button>findViewById(R.id.button2);
        mtextview = this.<TextView>findViewById(R.id.Time);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MTimeRunning) {
                    stopTimer();

                }
                else {
                        startTimer();
                }
            }
        });


    }

    private void stopTimer(){
        countDownTimer.cancel();
        MTimeRunning=false;
        startButton.setText("START");
    }

    private void startTimer() {

        final CharSequence value1 = mtextview.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0, 2);
        String num3 = num1.substring(3, 5);

        final int number = Integer.valueOf(num2) * 60 + Integer.valueOf(num3);
        MTimeLeft = number * 1000;


        countDownTimer = new CountDownTimer(MTimeLeft, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                MTimeLeft = millisUntilFinished;
                updateTimer();

            }

            @Override
            public void onFinish() {

                int newvalue = Integer.valueOf(buttonValue) + 1;
                if (newvalue < 7) {
                    Intent intent = new Intent(ex1_prossingSystem.this, ex1_prossingSystem.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value", String.valueOf(newvalue));
                    startActivity(intent);
                } else {
                    newvalue = 1;
                    Intent intent = new Intent(ex1_prossingSystem.this, ex1_prossingSystem.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value", String.valueOf(newvalue));
                    startActivity(intent);

                }

            }
        }.start();
        startButton.setText("Pause");
        MTimeRunning = true;
    }
        private void updateTimer() {
            int minutes = (int) MTimeLeft / 60000;
            int seconds = (int) MTimeLeft % 60000 / 1000;
            String timeLeftText = "";
            if (minutes < 10)
                timeLeftText ="0";
            timeLeftText = timeLeftText + minutes + ":";
            if (seconds < 10)
                timeLeftText+="0";
            timeLeftText += seconds;
            mtextview.setText(timeLeftText);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void mountainClimber(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/shorts/qQPMwAV8tVs"));
        startActivity(intent);
    }

    public void BasicCrunches(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/shorts/qXpYgvQ6_m4"));
        startActivity(intent);
    }

    public void BenchDips(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/SLk3UUV8GuI"));
        startActivity(intent);

    }

    public void Bicycle(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/CakPX7X-mSw"));
        startActivity(intent);
    }

    public void legRaise(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/wt1zvu84oGo"));
        startActivity(intent);
    }


    public void AlHellTouch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/zsael_A2yxI"));
        startActivity(intent);
    }

    public void LegUpCrunches(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://youtube.com/shorts/zsael_A2yxI"));
        startActivity(intent);
    }

    public void SitUp(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/qXpYgvQ6_m4"));
        startActivity(intent);
    }

    public void ex9_Ups(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iP2fjvG0g3w"));
        startActivity(intent);
    }

    public void PlankRotation(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/v25dawSzRTM"));
        startActivity(intent);
    }

    public void PlankLegLeft(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/6mDUQZTdrtM"));
        startActivity(intent);
    }

    public void RussianTwist(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/-cPtvFdT8dc"));
        startActivity(intent);
    }

    public void Bridge(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/X_IGw8U_e38"));
        startActivity(intent);
    }

    public void VerticalLegCrunches(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/BbgiLDWhf1I"));
        startActivity(intent);
    }

    public void WindMill(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/shorts/feRn77v7LNg"));
        startActivity(intent);
    }
}