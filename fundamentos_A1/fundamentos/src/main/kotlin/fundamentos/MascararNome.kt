package fundamentos

fun main() {

    println("Hello world")
    var nome = retornaNome()!!
    println(nome)
    print(mascaraNome(nome))

}

fun retornaNome(): String {
    return "Mickael jackson da Silva"
}

fun mascaraNome(nome: String): String {

    val nomeSeparado = nome.split(" ")
    val nomeMascarado = nomeSeparado.map {parte ->
        if(parte.length>2) {
            parte.substring(0,2) + "*".repeat(parte.length-2)
        }else{
            parte
        }
    }
    return nomeMascarado.joinToString(" ")
}

