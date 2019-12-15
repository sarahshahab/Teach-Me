package com.example.teachme;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Spinner;

public class registrasimurid1 extends AppCompatActivity implements View.OnClickListener {
    Spinner TingkatSpinner, KelasSpinner, JurusanSpinner;
    private static final int RESULT_LOAD_IMAGE = 1;
    ImageView ImageUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasimurid1);

        ImageUpload = (ImageView) findViewById(R.id.imageupload);


        ImageUpload.setOnClickListener(this);

        TingkatSpinner = findViewById(R.id.spinner7);
        KelasSpinner = findViewById(R.id.spinner);
        JurusanSpinner = findViewById(R.id.spinner3);
        final String Tingkat[] = {"Pilih Kelas", "SD", "SMP", "SMA"};

        final String SD[] = {"1", "2", "3", "4", "5", "6"};
        final String SMP[] = {"7", "8", "9"};
        final String SMA[] = {"10", "11", "12"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, Tingkat);
        TingkatSpinner.setAdapter(adapter);

        TingkatSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelect = Tingkat[position];
                if (position == 1) {
                    ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(registrasimurid1.this, android.R.layout.simple_spinner_dropdown_item, SD);
                    KelasSpinner.setAdapter(adapter1);

                    KelasSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String KelasSelect = SD[position];
                            //                        Toast.makeText(MainActivity.this, ""+KelasSelect, Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                if (position == 2) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(registrasimurid1.this, android.R.layout.simple_spinner_dropdown_item, SMP);
                    KelasSpinner.setAdapter(adapter2);
                }
                if (position == 3) {
                    ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(registrasimurid1.this, android.R.layout.simple_spinner_dropdown_item, SMA);
                    KelasSpinner.setAdapter(adapter3);
                }
                //          Toast.makeText(MainActivity.this, "Select Item: "+itemSelect, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageupload:
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
                break;


        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            ImageUpload.setImageURI(selectedImage);
        }
    }
    public void berhasi_murid (View view){
        Intent intentb = new Intent(this,berhasilmurid.class);
        startActivity(intentb);
    }
}
