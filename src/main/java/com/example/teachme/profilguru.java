package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class profilguru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilguru);
    }
    public void menu (View view){
        Intent intent09 = new Intent(this,Main2Activity.class);
        startActivity(intent09);
    }
    public void pesanguru (View view){
        Intent intentp = new Intent(this,pesanjohnny.class);
        startActivity(intentp);
    }
    public void paketdua (View view){
        Intent intentps = new Intent(this,pesanjohnny2.class);
        startActivity(intentps);
    }
    public void paketiga (View view){
        Intent intentiga = new Intent(this,pesanjohnny3.class);
        startActivity(intentiga);
    }
    public void paketempat (View view){
        Intent intentempat = new Intent(this,pesanjohnny4.class);
        startActivity(intentempat);
    }
}
