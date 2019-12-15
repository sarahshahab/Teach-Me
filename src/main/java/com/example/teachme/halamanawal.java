package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class halamanawal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanawal);
    }
    public void ClickMasuk(View view){
        Intent intent1 = new Intent(this,Login.class);
        startActivity(intent1);
    }
    public void ClickDaftar(View view){
        Intent intent2 = new Intent(this,Registrasi.class);
        startActivity(intent2);
    }
}
