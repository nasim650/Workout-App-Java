package com.abc.nasimtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Under18(View view) {
        Intent myIntent = new Intent(MainActivity.this, under18work.class);
        startActivity(myIntent);
    }

    public void Over18(View view) {
        Intent myIntent = new Intent(MainActivity.this, over18work.class);
        startActivity(myIntent);
    }

    public void food(View view) {
        Intent myIntent = new Intent(MainActivity.this, food_or_nutrition.class);
        startActivity(myIntent);
    }
}