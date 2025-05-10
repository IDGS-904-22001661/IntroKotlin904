package com.lifethech.introkotlin904.TemasKotlin

fun main(){
    do {
        println("Ingrese el numero para la piramide")
        val num = readln().toInt()
        if (num > 0) {
            var fila = 1
            do {
                var repeticiones = 1
                do {
                    print("*")
                    repeticiones++
                } while (repeticiones <= fila)
                println()
                fila++
            } while (fila <= num)
        }
    } while (num != 0)
}