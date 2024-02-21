fun main() {
    println("Digite o custo de afábrica do veículo: ")
    var custo = readln().toDouble()

    if(custo < 50000){
        custo *= 1.05
    } else if(custo < 80000){
        custo += custo*0.1 + custo*0.15
    } else {
        custo += custo*0.15 + custo*0.2
    }

    println("O valor final do veículo é de R$$custo")
}