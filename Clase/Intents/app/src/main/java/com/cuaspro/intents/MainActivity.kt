package com.cuaspro.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnAceptar : Button
    private lateinit var txtTexto : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Clase: Intents")
        
        setup()
    }
    
    private fun setup() {
        btnAceptar = findViewById(R.id.xbn)
        txtTexto = findViewById(R.id.xet)

        btnAceptar.setOnClickListener({
            val intent = Intent(this, SecondActivity::class.java )
            intent.putExtra("contenido", txtTexto.text.toString())
            startActivity(intent)
        })
    }
    
    
}