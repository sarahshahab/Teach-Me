package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrasimurid2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasimurid2);
    }

    public void lanjuts (View view){
        Intent intent10 = new Intent(this,registrasimurid1.class);
        startActivity(intent10);
    }
}
