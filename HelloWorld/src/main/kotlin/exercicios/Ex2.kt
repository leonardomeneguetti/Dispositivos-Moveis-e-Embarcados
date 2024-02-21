package exercicios

fun main() {
    println("Digite o custo do espetaculo teatral: ")
    val espetaculo = readln().toDouble()
    println("Digite o preço do ingresso: ")
    val ingresso = readln().toDouble()

    val qtdIngressos = espetaculo/ingresso

    println("É necessário vender pelo menos $qtdIngressos ingressos para arcar com os custos do espetaculo.")
}