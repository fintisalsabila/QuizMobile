package com.example.quizmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Halaman1 : AppCompatActivity() {

    private lateinit var btnBack : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman2)

        btnBack = findViewById(R.id.btnBackAldi)

        btnBack.setOnClickListener{
            val intent = Intent(this, FragmainActivity::class.java)
            startActivity(intent)
        }
    }
}