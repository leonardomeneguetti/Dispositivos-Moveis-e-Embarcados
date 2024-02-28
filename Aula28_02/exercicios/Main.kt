package Aula28_02.exercicios

fun main() {
//    Ex4
    val carro = CarroEx4("Fiat", "Uno", 2018, "ABC1D23")
    carro.mostra()

//    Ex5
    val cliente = ClienteEx5("Leonardo", "Av. Araraquara", "(16) 91234-5678", "12/12/2024")
    cliente.mostra()

//    Ex6
    val produto = ProdutoEx6("Teclado de computador", 120.0, "Teclado para computador", 10)
    produto.mostra()

//    Ex7
    val funcionario = Funcionario("Leonardo", "123.123.123-12", "Programador back-end Júnior")
    println("Funcionario: ")
    funcionario.exibir()
    println("Bônus: ${funcionario.calcularBeneficios()}")
    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
    val empregado = Empregado("Rogério", "234.234.234-23", "Programador front-end Júnior", 2100.0, "28/02/2024")
    println("Empregado: ")
    empregado.exibir()
    println("Bônus: ${empregado.calcularBeneficios()}")
    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
    val gerente = Gerente("da Silva", "345.345.345-34", "Gerente", 4000.0, "27/02/2024", 200.0)
    println("Gerente: ")
    gerente.exibir()
    println("Bônus: ${gerente.calcularBeneficios()}")
    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
    val estagiario = Estagiario("Meneguetti", "456.456.456-45", "Estagiário de desenvolvimento", 500.0, "IFSP")
    println("Estagiário: ")
    estagiario.exibir()
    println("Bônus: ${estagiario.calcularBeneficios()}")
}