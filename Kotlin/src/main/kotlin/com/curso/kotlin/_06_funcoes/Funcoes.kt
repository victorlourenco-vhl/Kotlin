package com.curso.kotlin._06_funcoes

fun main() {
    println(math(5, 3))
    println(mathExpressionBody(6, 3))
    println(mathWithDefaults(numB = 3))
}

fun math(numA: Int, numB: Int): Int {
    return numA + numB
}

fun mathExpressionBody(numA: Int, numB: Int): Int = numA + numB;

fun mathWithDefaults(numA: Int = 0, numB: Int = 2): Int {
    val result = numA + numB
    return result
}