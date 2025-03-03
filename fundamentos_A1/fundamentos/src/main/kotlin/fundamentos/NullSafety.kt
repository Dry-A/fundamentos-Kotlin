package fundamentos

fun main(){

    var nome: String?
    nome = "Henrique"

    println(nome.length)

    var nome2: String? = ""
    var tamanho: Int = nome2?.length?: 0

    println(tamanho)
}