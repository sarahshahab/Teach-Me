package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pesanmaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanmaria);
    }
    public void konfirmasi (View view){
        Toast.makeText(pesanmaria.this,"Pesanan Sudah Terkirim",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(pesanmaria.this, ProfilMaria.class);
        startActivity(i);
    }
    public void batalkan (View view){
        Toast.makeText(pesanmaria.this,"Pesanan Sudah Dibatalkan",Toast.LENGTH_SHORT).show();
        Intent a = new Intent(pesanmaria.this, ProfilMaria.class);
        startActivity(a);
    }
}
