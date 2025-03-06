package fundamentos.statics

class Pessoa(val nome: String, val idade: Int, val cpf: String) {

    override fun toString(): String {
        return "Validando cadastro de (nome='$nome', idade=$idade, cpf='$cpf')"
    }

}