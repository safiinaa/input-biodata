package com.example.tugasuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnsimpan = findViewById<Button>(R.id.btnSimpan)
        val namamhs = findViewById<EditText>(R.id.namamhs)
        val nim = findViewById<EditText>(R.id.nim)
        val jurusan = findViewById<EditText>(R.id.jurusan)
        val fakultas = findViewById<EditText>(R.id.fakultas)

        btnsimpan.setOnClickListener {
            val namamhs = namamhs.text.toString()
            val nim = nim.text.toString().toInt()
            val jurusan = jurusan.text.toString()
            val fakultas = fakultas.text.toString()

            Intent(this, SimpanBiodata::class.java).also{
                it.putExtra("namamhs", namamhs)
                it.putExtra("nim", nim)
                it.putExtra("jurusan", jurusan)
                it.putExtra("fakultas", fakultas)
                startActivity(it)
            }
        }
    }
}