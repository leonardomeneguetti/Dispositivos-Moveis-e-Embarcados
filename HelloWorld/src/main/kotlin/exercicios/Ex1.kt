package exercicios

fun main() {
    println("Adriana comprou um saco de ração com peso em quilos. Ela possui dois gatos, para os quais fornece a quantidade de ração em gramas. A quantidade diária de ração fornecida para cada gato é sempre a mesma.")
    println("Digite o peso do saco de ração: ")
    val qtdSaco = readln().toDouble()
    println("Digite a quantidade fornecida para cada gato: ")
    val cadaGato = readln().toDouble()

    val restante = qtdSaco - (cadaGato*2)*5
    println("Quantidade de ração restante no saco: $restante Kg")
}