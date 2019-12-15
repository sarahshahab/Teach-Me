package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class permintaanajar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permintaanajar);
    }
    public void konfirmasi (View view){
        Intent intent13 = new Intent(this,gurukemurid.class);
        startActivity(intent13);
    }
}
