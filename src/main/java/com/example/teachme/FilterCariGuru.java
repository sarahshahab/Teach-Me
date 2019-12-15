package com.example.teachme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FilterCariGuru extends AppCompatActivity {
    Spinner TingkatSpinner, KelasSpinner, JurusanSpinner, PelajaranSpinner, TarifSpinner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_cari_guru);
        TingkatSpinner = findViewById(R.id.spinner1);
        KelasSpinner = findViewById(R.id.spinner2);
        JurusanSpinner = findViewById(R.id.spinner3);
        PelajaranSpinner = findViewById(R.id.spinner4);
        TarifSpinner = findViewById(R.id.spinner5);

        final String Tingkat[]={"Pilih Kelas","SD","SMP","SMA"};

        final String SD[]={"1","2","3","4","5","6"};
        final String SMP[]={"7","8","9"};
        final String SMA[]={"10","11","12"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Tingkat);
        TingkatSpinner.setAdapter(adapter);

        TingkatSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelect = Tingkat[position];
                if (position==1){
                    ArrayAdapter<String>adapter1=new ArrayAdapter<String>(FilterCariGuru.this, android.R.layout.simple_spinner_dropdown_item,SD);
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
                if (position==2){
                    ArrayAdapter<String>adapter2=new ArrayAdapter<String>(FilterCariGuru.this, android.R.layout.simple_spinner_dropdown_item,SMP);
                    KelasSpinner.setAdapter(adapter2);
                }
                if (position==3){
                    ArrayAdapter<String>adapter3=new ArrayAdapter<String>(FilterCariGuru.this, android.R.layout.simple_spinner_dropdown_item,SMA);
                    KelasSpinner.setAdapter(adapter3);
                }
                //          Toast.makeText(MainActivity.this, "Select Item: "+itemSelect, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void back (View view){
        Intent intent9ss = new Intent(this,cariguru.class);
        startActivity(intent9ss);
    }
}
