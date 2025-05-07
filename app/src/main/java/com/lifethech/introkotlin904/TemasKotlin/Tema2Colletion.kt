package com.lifethech.introkotlin904.TemasKotlin

/*
List
MutableList
set
MutableSet
Map
MutableMap
 */

fun Main(){
    val readOnlyFiguras = listOf("Cuadrado", "Triangulo", "circulo")
    println(readOnlyFiguras)
    var figura: mutableFiguras = mutableListOf("Cuadrado", "Triangulo", "circulo")
    val mutableFiguras: List<String> = figura

    val frutas = setOf("Manzana,banana, naranja")
    val frutas2 = mutableSetOf("Manzana,banana, naranja")

    val coches = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println(coches)
    val coche2 = mutableMapOf("uno" to 1, "dos" to 2, "tres" to 3)
    println(coche2)


}


