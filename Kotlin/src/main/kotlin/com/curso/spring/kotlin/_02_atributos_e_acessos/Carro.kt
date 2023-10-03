package com.curso.spring.kotlin._02_atributos_e_acessos

class Carro(var cor: String, val anoFabricacao: Int, var proprietario: Proprietario) {

}

class Proprietario(var nome: String, var idade: Int) {

}

fun main() {

    val carro = Carro("Azul", 1982, Proprietario("Alfredo", 32))

    println(carro.cor)
    carro.cor = "Amarelo"
    println(carro.cor)

    println(carro.proprietario.nome)
    carro.proprietario.nome = "Yoda"
    println(carro.proprietario.nome)

}