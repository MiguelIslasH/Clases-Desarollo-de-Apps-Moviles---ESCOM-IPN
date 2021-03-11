package com.cuaspro.listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var txtDatos : EditText
    private lateinit var btnEnviar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup(){
        txtDatos = findViewById(R.id.txtDatos)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener({
            sendData(txtDatos)
        })
    }

    private fun sendData(txtDatos : EditText) {
        txtDatos.setText("Datos enviados con éxito!")
    }
}