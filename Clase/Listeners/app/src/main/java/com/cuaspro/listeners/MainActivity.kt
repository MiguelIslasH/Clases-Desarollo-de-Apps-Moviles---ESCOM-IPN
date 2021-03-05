package com.cuaspro.listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup(){
        var txtDatos : EditText = findViewById(R.id.txtDatos)
        var btnEnviar : Button = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener({
            sendData(txtDatos)
        })
    }

    private fun sendData(txtDatos : EditText) {
        txtDatos.setText("Datos enviados con éxito!")
    }
}