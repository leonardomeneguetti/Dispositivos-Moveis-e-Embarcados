package Aula28_02.exercicios

class Estagiario(nome:String, cpf:String, cargo:String, var blsAux:Double, var inttEnsino:String) : Funcionario(nome, cpf, cargo){
    override fun exibir() {
        super.exibir()
        println("Bolsa de Auxílio: $blsAux\n" +
                "Instituição de ensino: $inttEnsino"
        )
    }

    override fun calcularBeneficios(): Double {
        return super.calcularBeneficios() + blsAux
    }
}
