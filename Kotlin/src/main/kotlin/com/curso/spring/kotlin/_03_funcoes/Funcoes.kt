package com.curso.spring.kotlin._03_funcoes

fun main() {
    println("Olá, Mundo")
    println(saudacoes("Linus Torvalds"))
}

fun saudacoes(nome: String): String {
    return "Olá, $nome! Tudo bem?"
}