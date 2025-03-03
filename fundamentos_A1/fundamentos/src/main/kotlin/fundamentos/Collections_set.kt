package fundamentos

fun main(){

    //set nao recebe numeo duplicado
    var setNumeros = setOf(1,2,3,4,5,7,12,2,45, 4)
    println(setNumeros)

    println("${setNumeros.contains(50)} - Contém esse número")
    var setNumeros2 = mutableSetOf(34,54,12,11,21,23,10,4,3,2,2,3,1,0)
    println(setNumeros2)
}