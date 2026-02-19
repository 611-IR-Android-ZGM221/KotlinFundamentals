package com.example.lib

fun main(){
//    // ctrl + k, ctrl + c para comentar
//    // ctrl + k, ctrl + u para descomentar
//    //variables inmutables
//    val edad : Int = 20
//
//    //variables mutables
//    var nombre : String = "eee"
//    nombre = "E"
//    var s : Int? = null
//
//    println("$nombre tiene $edad")
//
//    //estructuras de control
//    for(i in 0..10){
//        println(i)
//    }
//
//    for(i in 10 downTo 0 step 2){
//        println(i)
//    }
//
//    val dayOfWeek = 4
//    when(dayOfWeek){
//        1 -> {
//            println("Es lunes")
//            println(":/")
//        }
//        2 -> println("Es martes")
//        3 -> println("Es miercoles")
//        4 -> println("Es jueves")
//        5 -> println("Es vierneees")
//        6,7 -> println("Es fin de semana")
//        else -> println("En que planeta vives broer")
//    }
    // Kotlin es un lenguaje null safety
    // Operador de estructura
    // Elvis ?:
    var base : Double = 0.0
    var height : Double = 0.0

    println("Escribe la base del rectangulo")
    val baseInput = readlnOrNull()
    base = baseInput?.toDoubleOrNull() ?: 0.0
    println("Escribe la altura del rectangulo")
    val heightInput = readlnOrNull()
    height = heightInput?.toDoubleOrNull() ?: 0.0
    val area = base * height
    if(area == 0.0) {
        println("Q paso master eso no es un numero :P")
    }else{
        println("El area es $area :3")
    }
}

//Creando funcionalidad 1
//Creando funcionalidad 2