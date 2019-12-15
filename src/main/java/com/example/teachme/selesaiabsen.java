package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class selesaiabsen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesaiabsen);
    }
    public void menu (View view){
        Intent intent13 = new Intent(this,Main3Activity.class);
        startActivity(intent13);
    }
    public void setting (View view){
        Intent intent1s3 = new Intent(this,pengaturanmurid.class);
        startActivity(intent1s3);
    }
}
