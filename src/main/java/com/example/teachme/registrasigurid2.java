package com.example.teachme;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class registrasigurid2 extends AppCompatActivity {
    private CheckBox check1, check2, check3, check4, check5, check6, check7, check8, check9, check10;
    private static  final int IMAGE_PICK_CODE =1000;
    private static final int PERMISSION_CODE=1001;
    private Button button_sel;
    ImageView mImageView;
    Button mChooseImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi_guru2);
        addListnerToCheckBox();
    }
    public void addListnerToCheckBox(){
        check1 = (CheckBox)findViewById(R.id.checkBox);
        check1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        if (((CheckBox)view).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "SD telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "SMP telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        check3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "SMA telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check4 = (CheckBox)findViewById(R.id.checkBox4);
        check4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "Kelas SD telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check5 = (CheckBox)findViewById(R.id.checkBox5);
        check5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "Kelas 7 telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check6 = (CheckBox)findViewById(R.id.checkBox6);
        check6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "Kelas 8 telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check7 = (CheckBox)findViewById(R.id.checkBox7);
        check7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "Kelas 9 telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check8 = (CheckBox)findViewById(R.id.checkBox8);
        check8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "Kelas 10 telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check9 = (CheckBox)findViewById(R.id.checkBox9);
        check9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "Kelas 11 telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        check10 = (CheckBox)findViewById(R.id.checkBox10);
        check10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()){
                            Toast.makeText(registrasigurid2.this,
                                    "Kelas 12 telah terpilih",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        mImageView = findViewById(R.id.imageView2);
        mChooseImage = findViewById(R.id.button2);

        mChooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                        String[] permission = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        requestPermissions(permission,PERMISSION_CODE);
                    }
                    else {
                        pickImageFromGallery();
                    }
                }
                else{
                    pickImageFromGallery();
                }
            }
        });
    }

    private void pickImageFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,IMAGE_PICK_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_CODE:{
                if (grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    pickImageFromGallery();
                }
                else
                    Toast.makeText(this,"Permission Denied!",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == IMAGE_PICK_CODE) {
            mImageView.setImageURI(data.getData());
        }
    }
    public void berhasilguru (View view){
        Intent intent13 = new Intent(this,berhasilguru.class);
        startActivity(intent13);
    }
}

