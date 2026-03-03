package com.example.lib.atarea2

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡GUAU!")
    }
}

class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Miau!")
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Muuu!")
    }
}

fun main() {
    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()
    val gato = Gato("Max", 2)
    gato.describirse()
    gato.hacerSonido()
    val vaca = Vaca("Lux", 5)
    vaca.describirse()
    vaca.hacerSonido()
}