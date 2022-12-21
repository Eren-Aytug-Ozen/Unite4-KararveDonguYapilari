package com.example.unite4_kararvedonguyapilari;

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
    public void btnUyg1Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg1Activitiy.class);
        startActivity(i);
    }
    public void btnUyg2Goster(View view){
        Intent i = new Intent(MainActivity.this,uyg2Activity.class);
        startActivity(i);
    }
}