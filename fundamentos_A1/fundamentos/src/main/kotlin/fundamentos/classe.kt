package fundamentos

class Pessoa(var nome: String, var idade: Int, var sexo: String, var apelido: String) {
    override  fun toString(): String {
        return " Pelo toString : Classe: Pessoa. Nome: ${nome}, Idade: ${idade}, Sexo: ${sexo}, Apelido: ${apelido}"
    }
}

fun main() {
    var pessoa1 = Pessoa("Gustavo", 24, "Masculino", "Guga")
    println(pessoa1)
}