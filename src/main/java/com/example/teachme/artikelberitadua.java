package com.example.teachme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class artikelberitadua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikelberitadua);
    }
    public void menu (View view){
        Intent intentmeni = new Intent(this,Main2Activity.class);
        startActivity(intentmeni);
    }
}
