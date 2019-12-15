package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilMaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_maria);
    }
    public void menu (View view){
        Intent intent09 = new Intent(this,Main2Activity.class);
        startActivity(intent09);
    }
    public void pesanguru (View view){
        Intent intentp = new Intent(this,pesanmaria.class);
        startActivity(intentp);
    }
}
