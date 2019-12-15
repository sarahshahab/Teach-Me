package com.example.teachme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class notifikasiguru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasiguru);
    }
    public void more (View view){
        Intent intent13 = new Intent(this,permintaanajar.class);
        startActivity(intent13);
    }
    public void menu (View view){
        Intent intent13 = new Intent(this,Main2Activity.class);
        startActivity(intent13);
    }
}
