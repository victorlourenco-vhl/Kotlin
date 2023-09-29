package com.curso.kotlin._04_while_and_for_expression

fun main() {
    var x = 0

    while (x <= 30) {
        println("x = $x")
        x += 3
    }

    x = 0
    do {
        x -= 3
        println("x = $x")
    } while (x > 0)

    for (item in 1..10) {
        println(item)
    }

    for(letra in  "Olá, Mundo!")
        println(letra)
}