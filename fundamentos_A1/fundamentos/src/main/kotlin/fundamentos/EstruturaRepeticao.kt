package fundamentos

fun main() {

    printa1a12()
    printa12a1()
    printaRange(5,34)
    whileMenorQue10()
    doWhileMenorQue10()

}

fun printa1a12() {

    for (numero in 1..12) {
        println(numero)

    }
}

fun printa12a1() {

    for (numero in 12 downTo 1) {
        println(numero)

    }
}

fun printaRange(inicio: Int, fim: Int) {

    println("Estou dentro do for, gente 🏹")
    for(numero in inicio .. fim){
        println(numero)
    }
}

fun whileMenorQue10(){
    var x = 0
    println("Estou dentro do while pesssoal 🙃")
    while(x<10){
        println(x)
        x++
    }
}

fun doWhileMenorQue10(){
    var x = 5
    println("Esttou aqui no do While agora 💀")
    do{
        println(x)
        x++

    }while(x<10)
}