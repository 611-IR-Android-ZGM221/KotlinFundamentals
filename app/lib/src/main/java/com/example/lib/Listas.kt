package com.example.lib

fun main(){
    val numeros = listOf<Int>(17, 22, 34, 46, 58, 69, 75, 81, 99, 101)
    val numerosCambian = mutableListOf<Int>()
    numerosCambian.add(2)
    numerosCambian.add(3)
//  Recomendable separar tipos de variables
    var numeroMaximo = numeros[0]
    for (n in numeros){
        if (n > numeroMaximo){
            numeroMaximo = n
        }
    }
    println(numeroMaximo)
    val palindromo = "farigiraf"
    for (letra in palindromo){
        println(letra)
    }

}