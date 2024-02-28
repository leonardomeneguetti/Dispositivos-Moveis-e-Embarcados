package Aula28_02.exercicios

open class Funcionario(var nome:String, var cpf:String, var cargo:String) {
    open fun exibir(){
        println("Nome: $nome\n" +
                "CPF: $cpf\n" +
                "Cargo: $cargo"
        )
    }

    open fun calcularBeneficios() : Double{
        return 0.0
    }
}
