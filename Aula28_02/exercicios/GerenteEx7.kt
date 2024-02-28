package Aula28_02.exercicios

class Gerente(nome:String, cpf:String, cargo:String, salario:Double, dtAdmiss:String, var bonus:Double) : Empregado(nome, cpf, cargo, salario, dtAdmiss) {
    override fun exibir() {
        super.exibir()
        println("Bônus: $bonus")
    }

    override fun calcularBeneficios(): Double {
        return super.calcularBeneficios() + bonus
    }
}
