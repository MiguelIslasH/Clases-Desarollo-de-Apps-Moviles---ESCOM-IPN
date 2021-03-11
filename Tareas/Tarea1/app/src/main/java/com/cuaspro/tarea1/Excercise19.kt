package com.cuaspro.tarea1

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Excercise19 : AppCompatActivity() {
    private lateinit var btnNext : Button
    private lateinit var txtBusqueda : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise19)
        setTitle("Tarea 1 : Ej. 19")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setup()
    }

    private fun setup(){
        txtBusqueda = findViewById(R.id.txtBusqueda)
        txtBusqueda.setOnEditorActionListener { v, actionId, event ->
            if(actionId == EditorInfo.IME_ACTION_SEARCH){
                Toast.makeText(this, "Busqueda: "+v.text, Toast.LENGTH_LONG).show()
                closeKeyBoard()
                true
            } else {
                false
            }
        }

        btnNext = findViewById(R.id.btnNextActivity19_20)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise20::class.java)
            startActivity(intent)
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