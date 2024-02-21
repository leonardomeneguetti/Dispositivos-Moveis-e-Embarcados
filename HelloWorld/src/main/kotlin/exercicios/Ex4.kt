fun main() {
    println("Digite o salário bruto: ")
    val salario = readln().toDouble()
    println("Digite o valor da prestação: ")
    val prestacao = readln().toDouble()

    println(if(prestacao <= salario*0.3) "O emprestimo pode ser concedido" else "O emprestimo não pode ser concedido")
}