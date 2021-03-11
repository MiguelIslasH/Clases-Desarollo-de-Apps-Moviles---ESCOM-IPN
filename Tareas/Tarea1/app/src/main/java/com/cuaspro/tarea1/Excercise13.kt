package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Excercise13: AppCompatActivity() {

    private lateinit var btnNext : Button
    private lateinit var txtCursor : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.
        layout.activity_excercise13)
        setTitle("Tarea 1 : Ej. 13")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {

        txtCursor = findViewById(R.id.txtCursor)
        txtCursor.setSelection(8)

        btnNext = findViewById(R.id.btnNextActivity13_14)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise14::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}