package Aula28_02.Exemplos

class Pessoa(var nome: String) {
//    var nome: String
//    var idade: Int
//
//    init {
//        this.nome = nome
//        this.idade = idade
//    }
    private var idade: Int = 0

    fun getIdade(): Int {
        return idade
    }

    fun setIdade(novaIdade: Int) {
        if(novaIdade >= 0) {
            idade = novaIdade
        }
    }

//    constructor(nome: String) :this(nome,0)

    fun saudacao(){
        println("Ola! Meu nome é ${nome} e tenho ${idade} anos")
    }
}