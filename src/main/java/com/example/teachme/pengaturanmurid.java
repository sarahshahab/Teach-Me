package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pengaturanmurid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturanmurid);
    }
    public void simpan (View view){
        Toast.makeText(pengaturanmurid.this,"Peraturan tersimpan",Toast.LENGTH_SHORT).show();
        Intent a = new Intent(pengaturanmurid.this, profilpengguna_murid.class);
        startActivity(a);
    }
}
