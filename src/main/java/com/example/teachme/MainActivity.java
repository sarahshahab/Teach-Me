package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void menu (View view){
        Intent intent09 = new Intent(this,Main2Activity.class);
        startActivity(intent09);
    }
    public void guruprofil (View view){
        Intent intentps = new Intent(this,profilguru.class);
        startActivity(intentps);
    }
    public void maria (View view){
        Intent maeis = new Intent(this,ProfilMaria.class);
        startActivity(maeis);
    }
    public void mrcus (View view){
        Intent mard = new Intent(this,profilmarcus.class);
        startActivity(mard);
    }
    public void anyas (View view){
        Intent ggg = new Intent(this,profilanya.class);
        startActivity(ggg);
    }
    public void rosaa (View view){
        Intent r = new Intent(this,profilrosa.class);
        startActivity(r);
    }
    public void artikels (View view){
        Intent intents9 = new Intent(this,artikelberita.class);
        startActivity(intents9);
    }
    public void artikeldua (View view){
        Intent intents10 = new Intent(this,artikelberitadua.class);
        startActivity(intents10);
    }
    public void artikeltiga (View view){
        Intent intents11 = new Intent(this,artikelberitatiga.class);
        startActivity(intents11);
    }
}
