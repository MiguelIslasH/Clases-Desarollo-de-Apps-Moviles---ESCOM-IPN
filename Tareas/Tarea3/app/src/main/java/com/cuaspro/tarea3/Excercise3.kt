package com.cuaspro.tarea3

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.ToggleButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Excercise3 : AppCompatActivity() {
    private lateinit var fbFloating : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise3)
        setTitle("Tarea 3: Floating B")

        setup()
    }

    private fun setup() {
        fbFloating = findViewById(R.id.fbFloating)
        fbFloating.setOnClickListener({
            Toast.makeText(this, "Soy un floating button!", Toast.LENGTH_LONG).show()
        })

    }

    override fun onCreateOptionsMenu(menu : Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_item -> {
                val intent = Intent(this, Excercise4::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}