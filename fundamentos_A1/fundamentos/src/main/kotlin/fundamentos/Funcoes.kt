package fundamentos

fun main(){
    var nome = mostraNome()!!
    println(nome)
    dizOi(nome)
    dizOi("Romilda")

}

fun mostraNome(): String {
    return "Isabela Carolina de Albuquerque"

}

fun dizOi(nome: String, idade: Int = 18){
    println("Oi $nome, é um prazer tê-lo aqui!, você tem $idade anos ou mais?")
}