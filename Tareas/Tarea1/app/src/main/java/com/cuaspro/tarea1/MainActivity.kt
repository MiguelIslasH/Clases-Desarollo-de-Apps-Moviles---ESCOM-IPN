package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnNext : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Tarea 1 : Ej. 1")

        setup()
    }

    private fun setup() {
        btnNext = findViewById(R.id.btnNextActivity1_2)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise2::class.java)
            startActivity(intent)
        })
    }
}