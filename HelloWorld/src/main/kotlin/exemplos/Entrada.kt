package exemplos

fun main() {
    print("Digite seu nome: ")
    //"readLine"/"readln" = comandos para ler do console
    val name = readLine()
    print("Digite sua idade: ")
    val idade = readln().toInt()

    println("Olá, $name! Você tem $idade anos.")
}