package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Excercise15: AppCompatActivity() {

    private lateinit var btnNext : Button
    private lateinit var txtCursor : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.
        layout.activity_excercise15)
        setTitle("Tarea 1 : Ej. 15")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {

        var ini = 0
        var fin = 0
        txtCursor = findViewById(R.id.txtCursor)
        val texto = txtCursor.text

        for (index in 0..txtCursor.length() - 1){
            if(texto[index] == ' '){
                fin = index
                break
            }
        }

        txtCursor.setSelection(ini, fin)

        btnNext = findViewById(R.id.btnNextActivity15_16)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise16::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}