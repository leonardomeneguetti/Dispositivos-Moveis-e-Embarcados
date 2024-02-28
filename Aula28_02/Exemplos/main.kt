package Aula28_02.Exemplos

fun main() {
//    var pessoa = Pessoa("Leonardo", 20)
//    pessoa.saudacao()
//
//    val pessoa2 = Pessoa("Jonas")
//    pessoa2.saudacao()
//
//    val animal = Animal("Jaguatirica")
//    animal.comer()
//
//    val cachorro = Cachorro("Rex")
//    cachorro.comer()
//    cachorro.latir()
//
//    var pessoa = Pessoa("Leonardo")
//    pessoa.setIdade(20)
//    println(pessoa.getIdade())

    val pessoa1 = PessoaData("leonardo", 20)
    val pessoa2 = PessoaData("leonardo", 20)

    println(pessoa1.equals(pessoa2))

    println(pessoa1.hashCode())

    println(pessoa1.toString())

    val pessoa3 = pessoa1.copy()
    println(pessoa1)
    println(pessoa3)
}