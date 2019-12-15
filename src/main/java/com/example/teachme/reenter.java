package com.example.teachme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class reenter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reenter);
    }
    public void logis (View view){
        Intent logins = new Intent(this,Login.class);
        startActivity(logins);
    }
}
