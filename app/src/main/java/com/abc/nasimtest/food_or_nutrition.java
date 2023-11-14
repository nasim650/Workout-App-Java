package com.abc.nasimtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class food_or_nutrition extends AppCompatActivity {

    ImageView imageView;
    Button button3,button4,button6,button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_or_nutrition);

        imageView = findViewById(R.id.imageView);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_or_nutrition.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_or_nutrition.this,health_tips.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_or_nutrition.this, Food_tips.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_or_nutrition.this, rest_schudule.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_or_nutrition.this, more.class);
                startActivity(intent);
            }
        });



    }
}