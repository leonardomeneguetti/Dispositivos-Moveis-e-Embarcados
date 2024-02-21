package exemplos

import kotlin.system.exitProcess

fun main() {
    val option = 2
    //outro nome pro switch/case
    when(option){
        1 -> println("Em dinheiro")
        2 -> println("Cartão de crédito")
        3 -> println("Cartão de débito")
        4 -> println("PIX")
        else -> println("Opção não encontrada")
    }
}