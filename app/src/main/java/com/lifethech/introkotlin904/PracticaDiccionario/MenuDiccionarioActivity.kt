package com.lifethech.introkotlin904.PracticaDiccionario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lifethech.introkotlin904.R

class MenuDiccionarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_diccionario)

        val btnCapturar = findViewById<Button>(R.id.btnVistaCapturar)
        btnCapturar.setOnClickListener{irVistaCaptura()}
        val btnBuscar = findViewById<Button>(R.id.btnVistaBuscar)
        btnBuscar.setOnClickListener{irVistaBuscar()}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun irVistaCaptura(){
        val intent = Intent(this, CapturarPalabrasActivity::class.java)
        startActivity(intent)
    }

    private fun irVistaBuscar(){
        val intent = Intent(this, BuscarPalabrasActivity::class.java)
        startActivity(intent)
    }

}