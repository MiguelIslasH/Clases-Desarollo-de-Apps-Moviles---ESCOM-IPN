package com.cuaspro.tarea1

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText

class Excercise8: AppCompatActivity() {

    private lateinit var btnNext : Button
    private lateinit var txtEj8 : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise8)
        setTitle("Tarea 1 : Ej. 8")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setup()
    }

    private fun setup() {
        btnNext = findViewById(R.id.btnNextActivity8_9)
        txtEj8 = findViewById(R.id.txtEj8)

        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise9::class.java)
            startActivity(intent)
        })


        txtEj8.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                closeKeyBoard()
            }

            override fun afterTextChanged(s: Editable?) {
                closeKeyBoard()
            }
        })
    }

    private fun closeKeyBoard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}