package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void menu (View view){
        Intent intent13 = new Intent(this,profilpengguna_murid.class);
        startActivity(intent13);
    }
    public void batalkan (View view){
        Intent a = new Intent(this, settinguru.class);
        startActivity(a);
    }
}
