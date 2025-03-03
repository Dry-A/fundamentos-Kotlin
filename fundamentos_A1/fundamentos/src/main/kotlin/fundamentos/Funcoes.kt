package fundamentos

fun main() {
    parImpar(10)
    parImpar(11)
    resultadoNota(7.6)
    resultadoNota(4.9)
    resultadoNota(5.9)
    resultadoNota(9.7)
}

fun mostraNome(): String {
    return "Isabela Carolina de Albuquerque"

}

fun dizOi(nome: String, idade: Int = 18) {
    println("Oi $nome, é um prazer tê-lo aqui!, você tem $idade anos ou mais?")
}

fun parImpar(numero: Int) {

    if (numero % 2 == 0) {
        println("Par")
    } else {
        println("Ímpar")
    }
}

fun resultadoNota(nota: Double) {
    if(nota < 5){
        println("Reprovado")
    } else if(nota >= 5 && nota < 7){
        println("Em recuperação")
    } else {
        println("Aprovado")
    }
}