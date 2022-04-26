package com.programmer.a10119211latihan2;
// Nama : Badra Samsudin Ramdan Nugraha
// Kelas : IF-06
// NIM : 10119211
// Tanggal Pengerjaan : 25 April 2022

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRegister(View view){
        Intent intent = new Intent(this, RegisterAcitfity.class);
        startActivity(intent);
    }
}