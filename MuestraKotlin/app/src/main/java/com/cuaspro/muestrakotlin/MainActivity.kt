package com.cuaspro.muestrakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
        var editText = findViewById<EditText>(R.id.txtNombre)
        var x = 5
        var y = 10
        var z = x + y

        editText.setText("$x + $y = $z")
    }
}