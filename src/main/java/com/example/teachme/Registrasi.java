package com.example.teachme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registrasi extends AppCompatActivity {

    EditText emailid, passid, userid, namaid;
    Button btnGuru, btnMurid, btnSignIn;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrasi);

        mFirebaseAuth=FirebaseAuth.getInstance();
        emailid = findViewById(R.id.fillEmail);
        passid = findViewById(R.id.fillPass);
        btnMurid =findViewById(R.id.clickmurid);
        btnGuru = findViewById(R.id.clickguru);
        btnSignIn=findViewById(R.id.button4);
        btnGuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailid.getText().toString();
                String pass = passid.getText().toString();
                if (email.isEmpty()){
                    emailid.setError("Please Enter Email");
                    emailid.requestFocus();
                }
                else if (pass.isEmpty()){
                    emailid.setError("Please Enter Password");
                    emailid.requestFocus();
                }
                else if (pass.isEmpty() && email.isEmpty()){
                    Toast.makeText(Registrasi.this,"Field Are Empty!",Toast.LENGTH_SHORT).show();
                }
                else if (!(pass.isEmpty() && email.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(Registrasi.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(Registrasi.this,"Sign up unsuccessful, please try again!",Toast.LENGTH_SHORT).show();
                            }
                            else { startActivity(new Intent(Registrasi.this, RegistrasiGuru1.class));
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(Registrasi.this,"Error Occured!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registrasi.this,Login.class);
                startActivity(intent);
            }
        });
        btnMurid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailid.getText().toString();
                String pass = passid.getText().toString();
                if (email.isEmpty()){
                    emailid.setError("Please Enter Email");
                    emailid.requestFocus();
                }
                else if (pass.isEmpty()){
                    emailid.setError("Please Enter Password");
                    emailid.requestFocus();
                }
                else if (pass.isEmpty() && email.isEmpty()){
                    Toast.makeText(Registrasi.this,"Field Are Empty!",Toast.LENGTH_SHORT).show();
                }
                else if (!(pass.isEmpty() && email.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(Registrasi.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(Registrasi.this,"Sign up unsuccessful, please try again!",Toast.LENGTH_SHORT).show();
                            }
                            else {
                                startActivity(new Intent(Registrasi.this, registrasimurid2 .class));
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(Registrasi.this,"Error Occured!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}