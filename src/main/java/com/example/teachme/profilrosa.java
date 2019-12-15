package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class profilrosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilrosa);
    }
    public void menu (View view){
        Intent intent09 = new Intent(this,Main2Activity.class);
        startActivity(intent09);
    }
}
