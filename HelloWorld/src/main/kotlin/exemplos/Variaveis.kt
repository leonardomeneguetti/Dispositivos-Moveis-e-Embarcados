package exemplos

fun main(args: Array<String>) {
    //"var" = variavel mutável
    var nome: String = "Leonardo"
    nome += " Meneguetti"

    //"val" = variavel imutavel
    val idade: Int = 20

    //Float precisa do f no final se for declarado explicitamente como tal
    val grana: Float = 2.50f
    val dinheiro = 2.5

    val maiorDeIdade = idade >= 18

    //"$nomeVariavel" = interpolação
    println("$nome, $idade anos, possui R$$grana")
    println("Maior de idade: $maiorDeIdade")

    //String é Array, entao funciona igual ao Java
    val primeiroChar = nome[0]
    val ultimoChar = nome[nome.length - 1]
    println("Primeiro caractere: $primeiroChar")
    println("Ultimo caractere: $ultimoChar")

    //"String.format()" te deixa controlar a String igual em C
    val menssagem = String.format("Ola, %s!", nome)
    println(menssagem)

    //Criando substrings
    val ultimoNome = nome.substring(9)
    println(ultimoNome)

    val primeiroNome = nome.substring(0,8)
    println(primeiroNome)

    //"TipoVar?" = declaração de variável que pode ser nula
    val name: String? = null
    //"nomeVar?:"..."" = Elvis Operator, coloca um valor caso a variavel seja nula
    val nomeCompleto = name?:"Desconhecido"
    println(nomeCompleto)

    //"nomeVar?.função" = Safe Call, permite utilizar função mesmo que tenha valor nulo, sem causar NullPointerException
    val saudacao = "Olá, ${name?.uppercase()}"
    println(saudacao)

    //"nomeVar!!" = Non-Null Assertion, transforma a variavel nula em não nula, causa NullPointerException
    val nomeNulo = name!!
    println(nomeNulo)
}