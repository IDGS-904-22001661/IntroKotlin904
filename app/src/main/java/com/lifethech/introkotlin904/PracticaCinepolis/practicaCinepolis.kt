package com.lifethech.introkotlin904.PracticaCinepolis

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.lifethech.introkotlin904.R

class practicaCinepolis : AppCompatActivity() {
    private lateinit var etNombre: EditText
    private lateinit var etCantidadCompradores: EditText
    private lateinit var etCantidadBoletos: EditText
    private lateinit var radioGroup: RadioGroup
    private lateinit var rbtnSi: RadioButton
    private lateinit var rbtnNo: RadioButton
    private lateinit var tvResultado: TextView
    private lateinit var btnPago:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practica_cinepolis)

        etNombre = findViewById(R.id.etNombre)
        etCantidadCompradores = findViewById(R.id.etCantidad)
        etCantidadBoletos = findViewById(R.id.etCantidadBoletos)
        radioGroup = findViewById(R.id.radioGroup2)
        rbtnSi = findViewById(R.id.rbtnSi)
        rbtnNo=findViewById(R.id.rbtnNo)
        tvResultado=findViewById(R.id.tvResultado)
        btnPago = findViewById(R.id.btnPago)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun obtenerPago(view: android.view.View){
        println("Estoy en el metodo obtenerPago")
        val nombre = etNombre.text.toString()
        val cantidadBoletos = etCantidadBoletos.text.toString()
        val cantidadCompradores = etCantidadCompradores.text.toString()
        val precioBoletos = 12.00
        var descuento = 0.00


        if (nombre.isEmpty() || cantidadBoletos.isEmpty() || cantidadCompradores.isEmpty()) {
            Toast.makeText(this, "Debe de llenar todos los campos primero.", Toast.LENGTH_SHORT).show()
            return
        }

        val numBoletos = cantidadBoletos.toInt()
        val numCompradores = cantidadCompradores.toInt()

        if (numBoletos > numCompradores * 7) {
            maxNumBoletos()
            return
        }

        var pagoTotal = numBoletos * precioBoletos

        when{
            numBoletos > 5 -> descuento = 0.15
            numBoletos in 3..5 -> descuento = 0.10
            else -> descuento = 0.0
        }

        pagoTotal = pagoTotal - (pagoTotal * descuento)

        if (rbtnSi.isChecked){
            pagoTotal = pagoTotal - (pagoTotal * 0.10)
        }

        tvResultado.text = "$ ${pagoTotal}"
        resultadoDePago()

    }

    fun maxNumBoletos() {
        AlertDialog.Builder(this)
            .setTitle("Excedio el numero de boletos")
            .setMessage("Solo se puede comprar un maximo de 7 boletos por persona")
            .setPositiveButton(android.R.string.ok,
                DialogInterface.OnClickListener { dialog, which ->
                })
            .show()
    }

    fun resultadoDePago() {
        AlertDialog.Builder(this)
            .setTitle("Compra exitosa")
            .setMessage("Gracias por su compra ${etNombre.text.toString()} su total es de ${tvResultado.text.toString()}")
            .setPositiveButton(android.R.string.ok,
                DialogInterface.OnClickListener { dialog, which ->
                })
            .show()
    }
}