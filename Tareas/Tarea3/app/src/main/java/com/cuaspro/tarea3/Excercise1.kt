package com.cuaspro.tarea3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import android.widget.ToggleButton

class Excercise1 : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageButton : ImageButton
    private lateinit var toggleButton : ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise1)
        setTitle("Tarea 3: Botones")

        setup()
    }

    private fun setup() {
        imageButton = findViewById(R.id.xib1)
        toggleButton = findViewById(R.id.xtb1)
        imageButton.setOnClickListener(this)
        toggleButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.xib1 -> {
                Toast.makeText(this, "Imagen clickeada!", Toast.LENGTH_SHORT).show()
            } else  -> {
                if(toggleButton.isChecked){
                    Toast.makeText(this, "Botón activado!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Botón Desactivado!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu : Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_item -> {
                val intent = Intent(this, Excercise2::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}