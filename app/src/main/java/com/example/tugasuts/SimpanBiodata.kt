package com.example.tugasuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SimpanBiodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simpan_biodata)

        val hasil = findViewById<TextView>(R.id.hasil)
        var intent = intent
        val  nama = intent.getStringExtra("namamhs")
        val  nim = intent.getIntExtra("nim", 0)
        val  jurusan = intent.getStringExtra("jurusan")
        val  fakultas = intent.getStringExtra("fakultas")

        hasil.text = "Nama Mahasiswa: \n"+nama+"\n\nNim:   \n"+nim+"\n\nJurusan:   \n"+jurusan+"\n\nFakultas:  \n"+fakultas


    }
}