package com.fikry.impintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    EditText editLink, editNim, editNama, editAlamat;
    String key_nama = "Nama";
    String key_nim = "Nim";
    String key_alamat = "Alamat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mengarahkan variable dengan data berdasarkan id
        editLink = findViewById(R.id.etLink);
        editNim = findViewById(R.id.etNim);
        editNama = findViewById(R.id.etNama);
        editAlamat = findViewById(R.id.etAlamat);
    }
    //Implicit Intent
    public void act_visit(View view) {
        String myUrl = editLink.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(myUrl));
        startActivity(intent);
    }

    //Explicit Intent
    public void act_submit(View view) {
        String nim = editNim.getText().toString();
        String nama = editNama.getText().toString();
        String alamat = editAlamat.getText().toString();
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra(key_nim,nim);
        intent.putExtra(key_nama,nama);
        intent.putExtra(key_alamat,alamat);
        startActivity(intent);
    }
}