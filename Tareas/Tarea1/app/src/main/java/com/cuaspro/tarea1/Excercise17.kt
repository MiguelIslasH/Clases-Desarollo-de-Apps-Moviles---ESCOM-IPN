package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Excercise17: AppCompatActivity() {

    private lateinit var btnNext : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise17)
        setTitle("Tarea 1 : Ej. 17")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {
        btnNext = findViewById(R.id.btnNextActivity17_18)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise18::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}