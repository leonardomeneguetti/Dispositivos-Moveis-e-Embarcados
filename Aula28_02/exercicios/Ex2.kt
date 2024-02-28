package Aula28_02.exercicios

fun main() {
    parImpar(4)
}

fun parImpar(num: Int){
    println(if(num % 2 == 0) "$num é par" else "$num é ímpar")
}