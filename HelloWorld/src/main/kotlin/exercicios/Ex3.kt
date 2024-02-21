package exercicios

import kotlin.system.exitProcess

fun main() {
    println("Digite o salário de Juliana: ")
    val salario = readln().toDouble()
    println("Digite o valor da primeira conta: ")
    var conta1 = readln().toDouble()
    println("Digite o valor da segunda conta: ")
    var conta2 = readln().toDouble()

    conta1 = conta1*1.02
    conta2 = conta2*1.02

    val sobra = salario - (conta1+conta2)

    println("Sobrou R$$sobra do salario de Juliana")
}