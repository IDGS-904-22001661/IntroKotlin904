package com.lifethech.introkotlin904.tema1app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lifethech.introkotlin904.R

class Ejemplo2Activity : AppCompatActivity() {
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo2)
        et1 = findViewById<EditText>(R.id.et1)
        et2 = findViewById<EditText>(R.id.et2)
        btn1 = findViewById<Button>(R.id.btn1)
        tv1 = findViewById<TextView>(R.id.tv1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun calcularMultiplicacion(view: android.view.View){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        var repeticiones = 0.0
        var resultado = 0.0
        while (repeticiones <valor2.toDouble()){
            resultado=resultado+valor1.toDouble()
            repeticiones++
        }
        tv1.text = resultado.toString()
    }
}