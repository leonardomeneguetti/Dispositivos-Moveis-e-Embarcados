package Aula28_02.exercicios

fun main() {
    val peso: Double = 90.0
    val altura: Double = 1.77

    println("Seu imc é ${imc(peso, altura)}")
}

fun imc(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}
