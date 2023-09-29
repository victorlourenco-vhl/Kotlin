package com.curso.kotlin._03_when_expression

fun main() {
    val pizzasOrdered = 5

    when(pizzasOrdered) {
        0 -> println("Sem fome")
        1 -> println("Com fome")
        2 -> println("Com MUITA fome")
        else -> println("Você tem certeza ?")
    }

    when(pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Você pediu $pizzasOrdered pizzas")
        else -> println("Você pediu 0 pizzas ou menos")
    }

    when(pizzasOrdered) {
        0 -> println("Precimos de pedidos")
        in 1 .. 4 -> println("Você fez alguns pedidos")
        in 5 .. 9 -> println("Obrigado! Você fez muitos pedidos")
        else -> println("Você tem certeza? ")
    }

    when {
        pizzasOrdered <= 0 -> println("Sem pedido")
        pizzasOrdered % 2 == 0 -> println("Você pediu um número para de pizzas")
        pizzasOrdered % 2 == 1 -> println("Você pediu um número ímpar de pizzas")
    }



}