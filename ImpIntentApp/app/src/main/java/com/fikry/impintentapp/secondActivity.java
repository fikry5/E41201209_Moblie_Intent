package com.fikry.impintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    //Deklarasi
    TextView hasilNim, hasilNama, hasilAlamat;
    String key_nim = "Nim";
    String key_nama = "Nama";
    String key_alamat = "Alamat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Mengarahkan variable dengan data berdasarkan id
        hasilNim = findViewById(R.id.tvNim);
        hasilNama = findViewById(R.id.tvNama);
        hasilAlamat = findViewById(R.id.tvAlamat);

        //Mengambil data dari inputan intent di MainActivity
        Bundle extra = getIntent().getExtras();

        //Menyimpan data
        String nim = extra.getString(key_nim);
        String nama = extra.getString(key_nama);
        String alamat = extra.getString(key_alamat);

        hasilNim.setText(nim);
        hasilNama.setText(nama);
        hasilAlamat.setText(alamat);
    }
}