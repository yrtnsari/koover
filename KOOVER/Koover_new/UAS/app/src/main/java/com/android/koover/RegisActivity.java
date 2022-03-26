package com.android.koover;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisActivity extends AppCompatActivity {
    private EditText nohpregis, passwordregis, namaregis;
    String nohp,pass, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        namaregis = (EditText) findViewById(R.id.txt_nama);
        passwordregis = (EditText) findViewById(R.id.txt_password);
        nohpregis = (EditText) findViewById(R.id.txt_nohp);
    }
    public void simpan(View view){
        nama = namaregis.getText().toString();
        pass = passwordregis.getText().toString();
        nohp = nohpregis.getText().toString();
        if(nama.matches("") || pass.matches("")){
            Toast.makeText(this, "Kolom tidak boleh kosong", Toast.LENGTH_LONG).show();
            return;
        }
        new RegisinActivity(this).execute(nama,pass,nohp);
        Toast.makeText(this,"Data Berhasil Disimpan",Toast.LENGTH_LONG).show();
        return;
    }
    public void masuk(View view) {
        startActivity(new Intent(RegisActivity.this,LoginActivity.class));
    }
}