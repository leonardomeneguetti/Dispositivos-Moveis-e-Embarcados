package Aula28_02.exercicios

fun main() {
    val temp: Double = 35.0

    println("35°C são ${cParaF(temp)}°F")
}

fun cParaF(temp: Double): Double {
    return (1.8*temp) + 32
}