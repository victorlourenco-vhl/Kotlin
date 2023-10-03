package com.curso.spring.kotlin._04_Collections

fun main() {

    val lista = listOf(1, 2, 3)
    val pares = lista.filter { x -> x % 2 == 0 }
    println(pares)
    lista.forEach { x -> println(x) }

    val listaMutavel = mutableListOf(4, 5, 6)
    listaMutavel.addAll(listOf(6, 7, 8, 9))
    listaMutavel.remove(6)
    print(listaMutavel)

    val listaSet = setOf(1, 2, 3, 3, 4)
    println(listaSet)

    val listaMap = mutableMapOf(0 to "Reta", 1 to "Curva")
    listaMap.put(2, "ZigZag")
    println(listaMap)

}