package Aula28_02.exercicios

class ProdutoEx6(var nome:String, var preco:Double, var desc:String, var estoque:Int) {
    fun mostra() {
        println("Nome: $nome\n" +
                "Preço: $preco\n" +
                "Descrição: $desc\n" +
                "Quantidade em estoque: $estoque")
    }
}