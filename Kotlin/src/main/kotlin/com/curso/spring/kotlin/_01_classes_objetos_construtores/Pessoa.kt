package com.curso.spring.kotlin._01_classes_objetos_construtores

class Pessoa(val nome: String, val idade: Int) {

    override fun toString(): String {
        return "Nome: $nome - Idade: $idade"
    }

}

fun main() {
    var pessoa = Pessoa("Maria", 32)
    print(pessoa)
}