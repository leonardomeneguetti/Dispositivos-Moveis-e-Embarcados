package exemplos

fun main() {
//    print("Digite sua idade: ")
//    val idade = readln().toInt()
//    if(idade >= 18){
//        println("Maior de idade")
//    } else {
//        println("Menor de idade")
//    }
//
//    //da pra colocar if/else dentro de uma variavel direto
//    val menssagem = if(idade >= 18) "Maior de idade" else "Menor de idade"
//    println(menssagem)

//    val ehBrasileiro = true
//    val temCnh = false
//
//    //da pra fazer essa atrocidade aqui
//    println(if(ehBrasileiro && temCnh) "Pode dirigir" else "Não pode dirigir")

    println("Digite a nota do aluno: ")
    val grade = readln().toDouble()
    if(grade >= 6){
        println("Aprovado")
    } else if(grade >= 4){
        println("IFA")
    } else {
        println("Reprovado")
    }
}