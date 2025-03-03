package fundamentos

fun main(){

    //nao adminte chave igual, sobreescreve
    var mapNomeIdade= mapOf("Silvia" to 33, "Neymar" to 28, "Carlos" to 21, "Eduardo" to 19, "Cleber" to 44)
    println(mapNomeIdade)

    var eleitorCandidato = mutableMapOf(234234 to "Lula",3222878 to "Bolsonaro", 9891821 to "Eneas", 9892839 to "Avanir")
    println(eleitorCandidato)

    eleitorCandidato.put(3423221, "Alckmin")
    eleitorCandidato[2392839] = "Marina"
    //nao adminte chave igual, sobreescreve
    eleitorCandidato[9891821] = "Roberto Carlos"
    println(eleitorCandidato)

    eleitorCandidato.remove(234234)
    println(eleitorCandidato)
}