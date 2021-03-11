package com.cuaspro.tarea1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Excercise5 : AppCompatActivity() {

    private lateinit var btnNext : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise5)
        setTitle("Tarea 1 : Ej. 5")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {
        btnNext = findViewById(R.id.btnNextActivity5_6)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise6::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}