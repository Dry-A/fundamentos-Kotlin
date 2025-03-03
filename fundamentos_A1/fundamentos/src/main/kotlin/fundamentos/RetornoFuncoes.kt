package fundamentos

fun retornaNumeroPorExtenso(numero: Int): String {
    if(numero==5){
        return "cinco"
    }else if(numero==4) {
        return "quatro"
    }
    return "número desconhecido"

}

fun main() {
    println(retornaNumeroPorExtenso(9))
}