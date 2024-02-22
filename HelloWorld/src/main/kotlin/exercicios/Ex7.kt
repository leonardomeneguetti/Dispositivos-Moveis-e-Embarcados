fun main() {
    println("Digite um numero inteiro: ")
    val num = readln().toInt()
    var cont = 2

    while (cont <= num) {
        if (cont == num - 1 || num == 2) {
            println("É primo")
            break
        } else if (num % cont == 0) {
            println("Não é primo")
            break
        }
        cont++
    }
}