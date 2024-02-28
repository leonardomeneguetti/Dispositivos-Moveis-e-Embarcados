package Aula28_02.Exemplos

class Cachorro(nome: String) : Animal(nome) {
    fun latir() {
        println("$nome: Au au!")
    }
}