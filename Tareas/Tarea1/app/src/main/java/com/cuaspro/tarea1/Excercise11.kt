package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Excercise11: AppCompatActivity() {

    private lateinit var btnNext : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise11)
        setTitle("Tarea 1 : Ej. 11")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {

        if(findViewById<EditText>(R.id.txtConFoco).isFocusable()){
            findViewById<EditText>(R.id.txtSinFoco).requestFocus()
        }

        btnNext = findViewById(R.id.btnNextActivity11_12)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise12::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}