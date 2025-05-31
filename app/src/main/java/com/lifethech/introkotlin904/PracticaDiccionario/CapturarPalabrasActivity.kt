package com.lifethech.introkotlin904.PracticaDiccionario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lifethech.introkotlin904.MenuActivity
import com.lifethech.introkotlin904.R

private val filename = "diccionario.txt"

class CapturarPalabrasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_capturar_palabras)

        val etEspanol = findViewById<EditText>(R.id.etEspanol)
        val etIngles = findViewById<EditText>(R.id.etIngles)
        val tvResultado = findViewById<TextView>(R.id.tvCaptura)

        val btnMenu = findViewById<Button>(R.id.btnMenu)
        btnMenu.setOnClickListener{irMenu()}
        val btnCapturar = findViewById<Button>(R.id.btnCapturar)
        btnCapturar.setOnClickListener{
            val textoEspanol = etEspanol.text.toString()
            val textoIngles = etIngles.text.toString()
            val text = "$textoEspanol:$textoIngles\n"
            try{
                openFileOutput(filename, MODE_APPEND).use {
                    it.write(text.toByteArray())
                }
                etEspanol.text.clear()
                etIngles.text.clear()
                tvResultado.text = "Palabra Guardadas con Exito: $textoEspanol - $textoIngles"
            }catch (e: Exception){
                e.printStackTrace()
                tvResultado.text="Error al guardar"

            }
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun irMenu() {
        val intent = Intent(this, MenuDiccionarioActivity::class.java)
        startActivity(intent)
    }
}