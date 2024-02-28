package Aula28_02.exercicios

class CarroEx4(var marca:String, var modelo:String, var ano:Int, var placa:String) {
    fun mostra() {
        println("Marca: $marca\n" +
                "Modelo: $modelo\n" +
                "Ano: $ano\n" +
                "Placa: $placa")
    }
}