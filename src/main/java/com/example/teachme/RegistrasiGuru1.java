package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrasiGuru1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi_guru1);
    }
    public void keguru2 (View view){
        Intent intent12 = new Intent(this,registrasigurid2.class);
        startActivity(intent12);
    }
}
