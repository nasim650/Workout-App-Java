package com.abc.nasimtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class under18work extends AppCompatActivity {

    int[] UArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under18work);
        UArray = new int[]{

                R.id.Mounatin_ex1,R.id.Basic_CR_ex2,R.id.Bench_ex3,R.id.Bicycle_ex4,R.id.Leg_Raise_ex5,R.id.Hell_Touch_ex6,R.id.Leg_Up_ex7,R.id.Sit_Up_ex8,
                R.id.V_Ups_ex9,R.id.Plank_Rotation_ex10,R.id.Plank_Leg_ex11,R.id.Russina_Twist_ex12, R.id.Bridge_ex13,R.id.Vertica_Leg_ex14,R.id.Wind_Mill_ex15

        };

    }

    public void Under18ImageClick(View view) {
        for(int i=0; i<UArray.length;i++){
            if(view.getId()==UArray[i]){
                int value=i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent= new Intent(under18work.this, ex1_prossingSystem.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }

    }
}