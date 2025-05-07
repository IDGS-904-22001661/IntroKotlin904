package com.lifethech.introkotlin904.TemasKotlin

/*
List
MutableList
set
MutableSet
Map
MutableMap

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
    println("Hola")

 */

fun main() {
    val readOnlyFiguras = listOf("cuadrado", "triangulo", "circulo")
    println(readOnlyFiguras)
    println("La primera figura es ${readOnlyFiguras[0]}")
    println("El primer elemento de la lista es ${readOnlyFiguras.first()}")
    println("Numero de elementos en la lista ${readOnlyFiguras.count()} items")
    println("circulo" in readOnlyFiguras)
    println(readOnlyFiguras)
    //readOnlyFiguras.add("pentagono")
    var figura: MutableList<String> = mutableListOf("cuadrado2", "triangulo2", "circulo2")
    println(figura)
    figura.add("pentagono2")
    println(figura)
    figura.remove("cuadrado2")
    println(figura)
}


