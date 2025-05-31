package com.lifethech.introkotlin904.PracticaDiccionario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lifethech.introkotlin904.R
import java.io.FileNotFoundException

class BuscarPalabrasActivity : AppCompatActivity() {
    private val filename = "diccionario.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buscar_palabras)

        val rbtnEspanol = findViewById<RadioButton>(R.id.rbtnEspanol)
        val rbtnIngles = findViewById<RadioButton>(R.id.rbtnIngles)
        val etPalabraBuscar = findViewById<EditText>(R.id.etPalabraBuscar)
        val tvResultado = findViewById<TextView>(R.id.tvPalabraEncontrada)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val btnMenu = findViewById<Button>(R.id.btnMenu)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBuscar.setOnClickListener{
            val palabraBuscar = etPalabraBuscar.text.toString().lowercase()
            var palabraEncontrada = ""
            var estado = false
            try{
                val contenido = openFileInput(filename).bufferedReader().useLines {
                    lines -> lines.joinToString ("\n")
                }
                println(contenido)
                val filas = contenido.split("\n")
                for (fila in filas){
                    val separacion = fila.split(":")
                    val parteEspanol = separacion[0]
                    val parteIngles = separacion[1]
                    if (rbtnEspanol.isChecked && parteIngles.lowercase() == palabraBuscar) {
                        palabraEncontrada = "$parteEspanol"
                        estado = true
                        break
                    } else if (rbtnIngles.isChecked && parteEspanol.lowercase() == palabraBuscar) {
                        palabraEncontrada = "$parteIngles"
                        estado = true
                        break
                    }

                }
                if (!estado){
                    palabraEncontrada = "Palabra no encontrada"
                }

                tvResultado.text = palabraEncontrada

            }catch (e: FileNotFoundException){
                tvResultado.text= "Archivo no encontrado"
            }catch (e: Exception) {
                e.printStackTrace()
                tvResultado.text = "Error"
            }

        }

        btnMenu.setOnClickListener {
            val intent = Intent(this, MenuDiccionarioActivity::class.java)
            startActivity(intent)
        }
    }
}