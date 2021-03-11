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

class Excercise20 : AppCompatActivity() {
    private lateinit var btnNext : Button
    private lateinit var txtET : EditText
    private lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise20)
        setTitle("Tarea 1 : Ej. 20")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setup()
    }

    private fun setup(){
        txtET = findViewById(R.id.xet1)

        txtET.setOnFocusChangeListener { view, hasFocus ->
            if(hasFocus){
                image = findViewById(R.id.xiv1)
                var drawable = image.drawable
                drawable = DrawableCompat.wrap(drawable)
                DrawableCompat.setTint(drawable,
                            ContextCompat.getColor(this, R.color.teal_700))
                Toast.makeText(this, "Set drawable compat", Toast.LENGTH_LONG).show()
            }
        }
        btnNext = findViewById(R.id.btnNextActivity20_21)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise21::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}