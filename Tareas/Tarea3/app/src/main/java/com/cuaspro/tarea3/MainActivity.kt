package com.cuaspro.tarea3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMetod1 : Button
    private lateinit var btnMetod2 : Button
    private lateinit var btnMetod3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Tarea 3: Botones")
        setup()
    }

    private fun setup() {
        btnMetod1 = findViewById(R.id.xbn1)
        btnMetod1.setOnClickListener(clickListener)

        btnMetod2= findViewById(R.id.xbn2)
        btnMetod2.setOnClickListener({
            showToastMessage("Botón digitado xbn2 \n Usa new btnListener")
        })

        btnMetod3 = findViewById(R.id.xbn3)
        btnMetod3.setOnClickListener(this)
    }

    private fun showToastMessage(msg : String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

    val clickListener = View.OnClickListener {view ->
        when (view.getId()) {
            R.id.xbn1 -> showToastMessage("Botón digitado xbn1 \n Usa clase btnListener")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_item -> {
                val intent = Intent(this, Excercise1::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu : Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onClick(v: View?) {
        showToastMessage("Botón digitado: xbn3\nUtiliza: implements OnClickListener.")
    }

    fun xbn4DesdeXML(view : View) {
        showToastMessage("Boton digitado: xbn4\nInvoca al método desde el XML.")
    }
}