package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pesanjohnny3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanjohnny3);
    }
    public void konfirmasi (View view){
        Toast.makeText(pesanjohnny3.this,"Pesanan Sudah Terkirim",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(pesanjohnny3.this, profilguru.class);
        startActivity(i);
    }
    public void batalkan (View view){
        Toast.makeText(pesanjohnny3.this,"Pesanan Sudah Dibatalkan",Toast.LENGTH_SHORT).show();
        Intent a = new Intent(pesanjohnny3.this, profilguru.class);
        startActivity(a);
    }
}
