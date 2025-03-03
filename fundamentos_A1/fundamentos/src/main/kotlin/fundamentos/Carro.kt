package fundamentos

class Carro(var cor: String, val marca: String, val modelo: String, val dono: Dono) {
    override fun toString(): String {
        return " ${marca} ${modelo} - Cor: ${cor}\n"
    }

}

class Endereco(
    val rua: String,
    val numero: Int,
    val bairro: String,
    val cidade: String,
    val estado: String,
    val cep: String
) {
    override fun toString(): String {
        return "Endereco: ${rua}, ${numero} \n" +
                "          ${bairro} - ${cidade} \n" +
                "          ${estado} - ${cep}"
    }
}

class Dono(val nome: String, val idade: Int, var endereco: Endereco) {
    override fun toString(): String {
        return "Dono: ${nome} - Idade: ${idade} \n" +
                "Endereço: ${endereco}\n" +
                "-- -- -- -- --"
    }
}

fun main() {

    var carro1 = Carro(
        "Preto",
        "Fiat",
        "Punto",
        Dono("Reinaldo", 24, Endereco("Rua 2", 603, "Lapa", "São Paulo", "SP", "12345-678"))
    )
    var carro2 = Carro(
        "Branco",
        "Ford",
        "Fusion",
        Dono("Carla", 44, Endereco("Rua 3", 244, "Vila Oliveira", "Mogi das Cruzes", "SP", "14435-690"))
    )


    println("Carro 2 ${carro2} ${carro2.dono} ")
    println("Carro 1 ${carro1} ${carro1.dono}")

}
