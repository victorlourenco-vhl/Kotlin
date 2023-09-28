package com.curso.kotlin._02_if_expression

fun main() {

    /*
    * No Kotlin o IF é considerado um expression (expressão),
    * enquanto o no Java é uma instruction (instrução). Sendo assim,
    * uma instrução é umas linha ou bloco de código que não retorna valor,
    * desse modo uma instrução não pode ficar do lado direito do sinal
    * de igual.
    * */

    val intA: Int = 199
    val intB: Int = 9

    val lower = if(intA < intB) intA else intB
 
    val temp = 29
    val isAirConditionerOn = if(temp > 26) {
        println("Está quente")
        true
    } else {
        println("Não está quente")
        false
    }
    println("O ar condicionado está ligado: $isAirConditionerOn")

}