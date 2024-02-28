package Aula28_02.exercicios

open class Empregado(nome:String, cpf:String, cargo:String, var salario:Double, var dtAdmiss:String) : Funcionario(nome, cpf, cargo) {
    override fun exibir(){
        super.exibir()
        println("Salário: $salario\n" +
                "Data de admissão: $dtAdmiss"
        )
    }

    override fun calcularBeneficios(): Double {
        return super.calcularBeneficios() + salario
    }
}
