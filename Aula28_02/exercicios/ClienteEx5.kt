package Aula28_02.exercicios

class ClienteEx5(var nome:String, var endereco:String, var telefone:String, var nasc:String) {
    fun mostra() {
        println("Nome: $nome\n" +
                "Endereço: $endereco\n" +
                "Telefone: $telefone\n" +
                "Data de nascimento: $nasc")
    }
}