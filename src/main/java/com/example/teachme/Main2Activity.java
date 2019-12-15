package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {
    ImageButton btnLogout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnLogout = findViewById(R.id.menuLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity( new Intent(Main2Activity.this, halamanawal.class));
                finish();
            }
        });
    }
    public void beranda (View view){
        Intent intent9s = new Intent(this,MainActivity.class);
        startActivity(intent9s);
    }
    public void cariguru (View view){
        Intent intes = new Intent(this,cariguru.class);
        startActivity(intes);
    }
    public void profil (View view){
        Intent intentpro = new Intent(this,profilpengguna_murid.class);
        startActivity(intentpro);
    }
    public void notifikasi (View view){
        Intent intentnot = new Intent(this,notifikasi.class);
        startActivity(intentnot);
    }
    public void presensi (View view){
        Intent intentpre = new Intent(this,PresensiMurid.class);
        startActivity(intentpre);
    }
    public void konsultasi (View view){
        Intent intentss = new Intent(this,chat.class);
        startActivity(intentss);
    }
}
