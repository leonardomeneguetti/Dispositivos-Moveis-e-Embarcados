package br.edu.ifsp.arq.ads.dmos5.ex4

class Cliente (private var nome: String,
               private var email: String,
               private var telefone: String,
               private var cpf: String,
               private var endereco: String,
               private var cidade: String) {

    fun getNome(): String{
        return nome
    }

    fun getEmail(): String{
        return email
    }

    fun getTelefone(): String{
        return telefone
    }

    fun getCpf(): String{
        return cpf
    }

    fun getEndereco(): String{
        return endereco
    }

    fun getCidade(): String{
        return cidade
    }

    fun setNome(nome: String){
        this.nome = nome
    }

    fun setEmail(email: String){
        this.email = email
    }

    fun setTelefone(telefone: String){
        this.telefone = telefone
    }

    fun setCpf(cpf: String){
        this.cpf = cpf
    }

    fun setEndereco(endereco: String){
        this.endereco = endereco
    }

    fun setCidade(cidade: String){
        this.cidade = cidade
    }
}