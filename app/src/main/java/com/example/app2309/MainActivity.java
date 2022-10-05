package com.example.app2309;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @SuppressLint("ResourceType")
    public void alteraFigura(View v)
    {
        ImageView pricipal = findViewById(R.id.imagePricipal);
        pricipal.setImageResource(R.drawable.kylo);
    }
    @SuppressLint("ResourceType")
    public void alteraFigura2(View v)
    {
        ImageView pricipal = findViewById(R.id.imagePricipal);
        pricipal.setImageResource(R.drawable.r2d2);
    }
    @SuppressLint("ResourceType")
    public void alteraFigura3(View v)
    {
        ImageView pricipal = findViewById(R.id.imagePricipal);
        pricipal.setImageResource(R.drawable.stormtrooper);
    }
    @SuppressLint("ResourceType")
    public void alteraFigura4(View v)
    {
        ImageView pricipal = findViewById(R.id.imagePricipal);
        pricipal.setImageResource(R.drawable.vader);
    }

}