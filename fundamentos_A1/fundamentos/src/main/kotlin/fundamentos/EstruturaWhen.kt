package fundamentos

fun main(){
    val x =16

    when(x) {
        5->println("x == 5 deu bom")
        in 11 .. 15 ->println("x está entre 11 e 15!")
        !in 30 ..40->println("x não está entre 30 e 40!")

        else -> {
        println("Somei mais 4 ao x = "+(x+4))
        }
    }

    println(comecaComOi("Oi"))

    when{
        comecaComOi("Oi, tudo bem?")->println("bom demais!")
    }
}

fun comecaComOi(x: Any): Boolean {
    return when(x) {

        is String -> x.toLowerCase().startsWith("oi")
        else->false
    }
}