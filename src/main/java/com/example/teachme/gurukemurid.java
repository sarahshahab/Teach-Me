package com.example.teachme;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class gurukemurid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurukemurid);
    }
    public void menu (View view){
        Intent intent13 = new Intent(this,profilpengguna_murid.class);
        startActivity(intent13);
    }
    public void terima (View view){
        Toast.makeText(gurukemurid.this,"Anda telah menerima murid ini",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(gurukemurid.this, notifikasi.class);
        startActivity(i);
    }
    public void tolak (View view){
        Toast.makeText(gurukemurid.this,"Anda menolak murid ini",Toast.LENGTH_SHORT).show();
        Intent a = new Intent(gurukemurid.this, notifikasi.class);
        startActivity(a);
    }
}
