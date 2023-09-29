package com.curso.kotlin._05_for_expression_and_array

fun main() {


    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${index + 1} ) $item")
    }

    val array = arrayOf(10, 20, 30, 40)

    for (index in array.indices) {
        println("index: $index - ${array.get(index)}")
    }

}