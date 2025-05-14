package com.lifethech.introkotlin904.tema1app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lifethech.introkotlin904.R

class Ejemplo1Activity : AppCompatActivity() {
    private lateinit var et1:EditText
    private lateinit var et2:EditText
    private lateinit var tv1:TextView
    private lateinit var btn1:Button
    private lateinit var radioGroup:RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo1)
        et1 = findViewById<EditText>(R.id.et1)
        et2 = findViewById<EditText>(R.id.et2)
        tv1 = findViewById<TextView>(R.id.tv1)
        btn1 = findViewById<Button>(R.id.btn1)
        radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun sumar(){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        val resultado = valor1.toDouble() + valor2.toDouble()
        tv1.text = resultado.toString()
    }
    fun restar(){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        val resultado = valor1.toDouble() - valor2.toDouble()
        tv1.text = resultado.toString()
    }
    fun dividir(){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        if (valor2.toDouble()==0.0){
            tv1.text = "No se puede dividir por 0 :)"
        }else{
            val resultado = valor1.toDouble() / valor2.toDouble()
            tv1.text = resultado.toString()
        }

    }
    fun multiplicar(){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        val resultado = valor1.toDouble() * valor2.toDouble()
        tv1.text = resultado.toString()
    }

    fun calcular(view: android.view.View){
        val seleccion = radioGroup.checkedRadioButtonId
        if (seleccion != -1){
            val radioButton = findViewById<RadioButton>(seleccion)
            val opcion = radioButton.text.toString();
            when(opcion){
                "Sumar" -> sumar()
                "Restar" -> restar()
                "Multiplicar" -> multiplicar()
                "Dividir" -> dividir()
            }
        }
    }
}