package com.lifethech.introkotlin904.TemasKotlin

import kotlin.math.sqrt

fun main() {
    var repeir = 0
    do {
        println("Ingrese los valores")
        println("Ingresa el valor de a")
        val a = readln().toDouble()
        println("Ingresa el valor de b")
        val b = readln().toDouble()
        println("Ingresa el valor de c")
        val c = readln().toDouble()

        if (a == 0.0){
            repeir = 1
            println("No se puede dividir por cero")
        }else{
            repeir = 0
            val raiz = (b*b)-(4*(a*c))

            if (raiz <0){
                println("No se puede hacer raiz negativa")
                repeir = 1
            }else{
                repeir = 0
                val parte1 = -(b)
                val parte2 = sqrt(raiz)
                val parte3 = 2 * a
                val x1 = (parte1 + parte2)/parte3
                val x2 = (parte1 - parte2)/parte3
                println("El valor de x1 = $x1 y el valor de x2 = $x2")
            }
        }

    }while(repeir == 1)

}
