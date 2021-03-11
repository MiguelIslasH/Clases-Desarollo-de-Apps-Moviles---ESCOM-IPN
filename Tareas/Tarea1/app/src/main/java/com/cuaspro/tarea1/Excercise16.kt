package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Excercise16: AppCompatActivity() {

    private lateinit var btnNext : Button
    private lateinit var txtCursor : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.
        layout.activity_excercise16)
        setTitle("Tarea 1 : Ej. 16")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {
        txtCursor = findViewById(R.id.txtCursor)
        txtCursor.selectAll()

        btnNext = findViewById(R.id.btnNextActivity16_17)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise17::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}