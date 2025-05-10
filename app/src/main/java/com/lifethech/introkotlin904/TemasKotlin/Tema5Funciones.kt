package com.lifethech.introkotlin904.TemasKotlin

fun saludo(){
    println("Hola mundo")

}

fun suma(a:Int,b:Int){
    println("La suma de $a + $b es ${a+b}")
}

fun resta(a:Int,b:Int):Int{
    return a-b
}

fun resta2(a:Int, b:Int)=a-b

fun main() {
    saludo()
    suma(2,3)
    println("La resta de 2-3 es ${resta(2,3)}")
}

//ejercicio que realice las operaciones basicas con un menu con salir
//Programa que permita hacer una piramide de asteriscos segun la cantidad, si se pone 0 se termina, solo do/while
//ejemplo
/*
*
* *
* **
 */

//programa que me permita calcular la formula general
//si se detecta que no se puede decir porque ejemplo(division entre o y raices negativas)
