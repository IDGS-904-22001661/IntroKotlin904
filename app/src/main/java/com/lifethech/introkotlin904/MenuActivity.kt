package com.lifethech.introkotlin904

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lifethech.introkotlin904.PracticaCinepolis.practicaCinepolis
import com.lifethech.introkotlin904.tema1app.Ejemplo1Activity
import com.lifethech.introkotlin904.tema1app.Ejemplo2Activity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btn1Ejemplo1 = findViewById<Button>(R.id.btn1Ejemplo1)
        btn1Ejemplo1.setOnClickListener{navegateToEjemplo1()}

        val btn2Cinepolis = findViewById<Button>(R.id.btn2Cienepolis)
        btn2Cinepolis.setOnClickListener{navegateToCinepolis()}

        val btn3Ejemplo2 = findViewById<Button>(R.id.btn3Ejemplo2)
        btn3Ejemplo2.setOnClickListener{navegateToEjemplo2()}

        val btn4Ejemplo3 = findViewById<Button>(R.id.btn4Ejemplo3)
        btn4Ejemplo3.setOnClickListener{navegateToEjemplo3()}

        val btn5Ejemplo4 = findViewById<Button>(R.id.btn5Ejemplo4)
        btn5Ejemplo4.setOnClickListener{navegateToEjemplo4()}

        val btnPracticaDiccionario = findViewById<Button>(R.id.btnPracticaDiccionario)
        btnPracticaDiccionario.setOnClickListener {
            val intent = Intent(this, com.lifethech.introkotlin904.PracticaDiccionario.MenuDiccionarioActivity::class.java)
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    private fun navegateToEjemplo1() {
        val intent = Intent(this, Ejemplo1Activity::class.java)
        startActivity(intent)
    }

    private fun navegateToCinepolis() {
        val intent = Intent(this, practicaCinepolis::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo2() {
        val intent = Intent(this, com.lifethech.introkotlin904.Tem2App.Ejemplo2Activity::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo3() {
        val intent = Intent(this, com.lifethech.introkotlin904.Tema3.Ejemplo3Activity::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo4() {
        val intent = Intent(this, com.lifethech.introkotlin904.Tema4.Ejemplo4Activity::class.java)
        startActivity(intent)
    }
}