package com.curso.kotlin

fun main() {
    println("Olá, Mundo!")
}

fun main(args: Array<String>) {
    val name = if(args.isNotEmpty()) args[0] else "Kotlin"
    print("Olá, $name!")
}