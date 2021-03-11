package com.cuaspro.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, intent.getStringExtra("contenido"), Toast.LENGTH_LONG).show()
    }
}