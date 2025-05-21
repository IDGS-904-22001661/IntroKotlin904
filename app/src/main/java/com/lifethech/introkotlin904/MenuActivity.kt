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
}