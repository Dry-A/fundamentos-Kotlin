package fundamentos

fun main() {

    //lista nao mutavel, e os numeros inferem que sao Inteiro
    var lista = listOf(1, 2, 3, 8, 7, 5, 98)

    //entre chaves vai o tipo - o ? pra indicar que podem ser nulos
    var lista2 = mutableListOf<Int?>(35, 23, 33, 2, 12, 31, 6, 11)

    //filter itera por todos os valores, verifica os valores - o it é o elemento da vez
    //aqui estamos pegando o primeiro elemento que é par
    lista.filter { it % 2 == 0 }.first()

    println(lista.filter { it % 2 == 0 }.first())

    println("Pelo for 🔥🔥")
    for (numero in lista) {
        println(numero)
    }

    println(lista[2])
    println(lista.size)
    println(lista.indexOf(7))

    println("Pelo for 🔥 - lista 2 - Antes das mudanças")
    for (numero in lista2) {
        println(numero)
    }
    lista2.remove(33)
    lista2.removeAt(2)
    lista2.add(0,45)
    lista2.shuffle()

    println("Pelo for 🔥 - lista 2 - mutável")
    for (numero in lista2) {
        println(numero)
    }
}