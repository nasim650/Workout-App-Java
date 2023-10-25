package com.abc.nasimtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ex1_prossingSystem extends AppCompatActivity {

    String buttonvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_prossing_system);

        Intent intent= getIntent();
        buttonvalue =intent.getStringExtra("value");
        int intvalue=Integer.valueOf(buttonvalue);

        switch (intvalue){

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
                setContentView(R.layout.activity_russina_twist_ex1);
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

    }
}