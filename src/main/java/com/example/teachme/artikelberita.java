package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class artikelberita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikelberita);
    }
    public void menu (View view){
        Intent intentmeni = new Intent(this,Main2Activity.class);
        startActivity(intentmeni);
    }
}
