fun main() {
    println("Informe o valor na etiqueta do produto: ")
    var valor = readln().toDouble()

    println("Informe a forma de pagamento: ")
    val pagamento = readln().toInt()

    when(pagamento){
        1 -> {
            valor *= 0.9
            println("O valor da compra é de R$$valor")
        }
        2 -> {
            valor *= 0.95
            println("O valor da compra é de R$$valor")
        }
        3 -> {
            valor /= 2
            println("O valor da compra é de duas vezes de R$$valor")
        }
        4 -> {
            valor = (valor*1.1)/3
            println("O valor da compra é de três vezes de R$$valor")
        }
        else -> println("Não existe essa forma de pagamento")
    }
}