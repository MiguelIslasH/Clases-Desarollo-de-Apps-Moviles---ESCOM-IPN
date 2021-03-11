package com.cuaspro.tarea1

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.*

class Excercise26 : AppCompatActivity() {
    private lateinit var btnNext : Button
    private val lista = arrayOf("Android", "Arriba", "Africa", "Asia", "América", "A", "AGUILA")
    private lateinit var auto : AutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise26)
        setTitle("Tarea 1 : Ej. 26")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setup()
    }

    private fun setup(){
        auto = findViewById(R.id.auto)
        var arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, lista )
        auto.setAdapter(arrayAdapter)

        btnNext = findViewById(R.id.btnNextActivity26_1)
        btnNext.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}