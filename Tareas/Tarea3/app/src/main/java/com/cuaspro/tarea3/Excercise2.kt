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

class Excercise2 : AppCompatActivity() {
    private lateinit var btnSound : Button
    private lateinit var mediaPlayer : MediaPlayer
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise2)
        setTitle("Tarea 3: Sonido")

        setup()
    }

    private fun setup() {
        mediaPlayer = MediaPlayer.create(this, R.raw.drum )
        btnSound = findViewById(R.id.btnSound)
        mediaPlayer.setOnPreparedListener({

            btnSound.setOnClickListener({
                mediaPlayer.start()
            })
        })

    }

    override fun onCreateOptionsMenu(menu : Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_item -> {
                val intent = Intent(this, Excercise3::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}