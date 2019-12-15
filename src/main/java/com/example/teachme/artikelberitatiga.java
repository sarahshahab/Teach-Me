package com.example.teachme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class artikelberitatiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikelberitatiga);
    }
    public void menu (View view){
        Intent intentmeni = new Intent(this,Main2Activity.class);
        startActivity(intentmeni);
    }
}
