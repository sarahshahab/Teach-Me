package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cariguru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cariguru);
    }
    public void jubaidah (View view){
        Intent intentouts = new Intent(this,profilguru.class);
        startActivity(intentouts);
    }
    public void filter (View view){
        Intent intentoust = new Intent(this,FilterCariGuru.class);
        startActivity(intentoust);
    }
    public void maria (View view){
        Intent intentousts = new Intent(this,ProfilMaria.class);
        startActivity(intentousts);
    }
    public void marcus (View view){
        Intent intentoussts = new Intent(this,profilmarcus.class);
        startActivity(intentoussts);
    }
    public void anya (View view){
        Intent intentots = new Intent(this,profilanya.class);
        startActivity(intentots);
    }
    public void rosa (View view){
        Intent rosas = new Intent(this,profilrosa.class);
        startActivity(rosas);
    }
    public void ashley (View view){
        Intent ashley = new Intent(this,profilashley.class);
        startActivity(ashley);
    }
    public void adam (View view){
        Intent adams = new Intent(this,profiladam.class);
        startActivity(adams);
    }
    public void clara (View view){
        Intent claras = new Intent(this,profilclara.class);
        startActivity(claras);
    }
    public void maura (View view){
        Intent mura = new Intent(this,profilmaura.class);
        startActivity(mura);
    }
    public void bresley (View view){
        Intent bre = new Intent(this,profilbresley.class);
        startActivity(bre);
    }
}
