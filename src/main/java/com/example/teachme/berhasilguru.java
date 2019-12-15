package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class berhasilguru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasilguru);
    }
    public void berhasil (View view){
        Intent intent9s = new Intent(this,Login.class);
        startActivity(intent9s);
    }
}
