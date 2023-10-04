package com.curso.spring.kotlin._05_companionobject

class ClasseA {

    /* Seria o equivalente a um método estático no Java */
    companion object {
        fun criarClasse(): ClasseA {
            return ClasseA()
        }
    }

}

class ClasseB {

    fun criarClasse(): ClasseB {
        return ClasseB()
    }

}

fun main() {

    var classeA = ClasseA.criarClasse()

    /* Precisa instanciar a classe para utilizar o método */
    var classeB = ClasseB().criarClasse()

}
