package com.lifethech.introkotlin904.TemasKotlin

fun main() {
    println("Calculadora")
    var opcion = 0
    do {
        println("Seleccione una opcion")
        println("1-Sumar")
        println("2-restar")
        println("3-multiplicar")
        println("4-dividir")
        println("5-salir")
        print("opcion: ")
        opcion = readln().toInt()
        when(opcion){
            1 -> sumar()
            2 -> restar()
            3 -> multiplicar()
            4 -> dividir()
            5 -> opcion = 5
        }


    }while (opcion!=5)
}

fun sumar(){
    println("Ingrese el primer valor")
    var val1 = readln().toDouble()
    println("Ingrese el segundo valor")
    var val2 = readln().toDouble()
    println("La suma de $val1 + $val2 = ${val1+val2}")
}

fun restar(){
    println("Ingrese el primer valor")
    var val1 = readln().toDouble()
    println("Ingrese el segundo valor")
    var val2 = readln().toDouble()
    println("La resta de $val1 - $val2 = ${val1-val2}")
}

fun multiplicar(){
    println("Ingrese el primer valor")
    var val1 = readln().toDouble()
    println("Ingrese el segundo valor")
    var val2 = readln().toDouble()
    println("La multiplicacion de $val1 * $val2 = ${val1*val2}")
}

fun dividir(){
    println("Ingrese el primer valor")
    var val1 = readln().toDouble()
    println("Ingrese el segundo valor")
    var val2 = readln().toDouble()
    println("La division de $val1 / $val2 = ${val1/val2}")
}