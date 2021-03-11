package com.cuaspro.tarea1

import android.app.Dialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Excercise2 : AppCompatActivity() {

    private lateinit var txtEntrada : EditText
    private lateinit var lblUsuario : TextView
    private lateinit var btnNext : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise2)
        setTitle("Tarea 1 : Ej. 2")
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setup()
    }

    private fun setup(){
        txtEntrada = findViewById(R.id.txtEntrada)
        lblUsuario = findViewById(R.id.lblUsuario)

        txtEntrada.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                lblUsuario = findViewById(R.id.lblUsuario)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                lblUsuario.setText(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {
                lblUsuario.setText(s.toString())
            }
        })

        btnNext = findViewById(R.id.btnNextActivity2_3)
        btnNext.setOnClickListener({
            val intent = Intent(this, Excercise3::class.java)
            startActivity(intent)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}