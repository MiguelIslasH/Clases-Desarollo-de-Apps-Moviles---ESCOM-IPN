package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Excercise14: AppCompatActivity() {

    private lateinit var btnNext : Button
    private lateinit var txtCursor : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.
        layout.activity_excercise14)
        setTitle("Tarea 1 : Ej. 14")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {

        txtCursor = findViewById(R.id.txtCursor)
        txtCursor.setSelection(8)
        Log.d("Obteniendo cursor...", txtCursor.getSelectionEnd().toString())
        Toast.makeText(this, "Posición del cursor: " + txtCursor.getSelectionEnd().toString(), Toast.LENGTH_LONG).show()

        btnNext = findViewById(R.id.btnNextActivity14_15)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise15::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}