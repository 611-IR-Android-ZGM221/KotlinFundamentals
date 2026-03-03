package com.example.lib.atarea2

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Saldo actual: $saldo")
    }
    fun retirar(cantidad: Double) {
        if(saldo > cantidad){
            saldo -= cantidad
            println("Saldo actual: $saldo")
        }else{
            println("ERROR: Saldo insuficiente")
        }
    }
    fun mostrarSaldo() {
        println("Saldo actual: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
}