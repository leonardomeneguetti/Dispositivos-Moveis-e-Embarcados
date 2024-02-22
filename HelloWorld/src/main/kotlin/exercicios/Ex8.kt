fun main() {
    var num: Int
    do{
        println("Digite um numero inteiro positivo: ")
        num = readln().toInt()
    } while (num < 0)

    var fatorial = 1
    for(cont in 1 .. num){
        fatorial *= cont
    }

    println("O fatorial de $num é $fatorial.")
}