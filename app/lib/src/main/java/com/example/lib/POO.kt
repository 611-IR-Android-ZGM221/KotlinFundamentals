package com.example.lib

// POO busca representar objetos de la vida real con codigo
// 4 pilares fundamentales
// Abstracción --- propiedades genéricas
// Polimorfismo --- diferentes clases pueden tener similitudes o mismas funciones heredando
// Herencia
// Encapsulamiento --- private

class Person(val name:String, val age:Int){
    fun sayHello(){
        println("Hola, soy $name y tengo $age años")
    }
}

// Clases Abstractas: no se pueden instanciar
abstract class Shape{
    abstract fun calcArea() : Double
}

class Circle(val radius : Double) : Shape(){
    override fun calcArea(): Double {
        return Math.PI * radius * radius
    }

}

class Square(val side : Double) : Shape(){
    override fun calcArea(): Double {
        return side * side
    }

}

open class Animal{
    open fun makeSound(){
        println("*Sonidos de animal*")
    }
}

class Eagle : Animal(){
    override fun makeSound() {
        println("AAAAAAAAAAA")
    }
}

class Bear : Animal(){

}

fun main(){
    val person = Person("Juan", 28)
    val person2 = Person(age = 28, name = "Juan")
    person.sayHello()
    println(person.name)
    println(person2.name)
    //person2.name = "Juan"
    //person2 = Person("Daniel", 30)

    val circle = Circle(10.0)
    val square = Square(10.0)

    val shapes = listOf(circle, square)
    val shape1 = shapes[0]
    shape1.calcArea() // Polimorfismo
}