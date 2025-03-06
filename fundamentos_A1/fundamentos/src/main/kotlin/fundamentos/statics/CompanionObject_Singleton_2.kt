package fundamentos.statics

import fundamentos.statics.Pessoa

class CursoProgramacao(val nome: String) {

    //lista de alunos matriculados
    private val cadastrados = mutableListOf<Pessoa>()

    fun realizarCadastro(pessoa: Pessoa) {
        cadastrados.add(pessoa)
        println("✅ $pessoa para o curso de $nome...")
    }

    fun validarMatricula(pessoa: Pessoa) {

        if (ValidadorCadastro.cadastroAprovado(pessoa)) {

            println("📧 Cadastro  de ${pessoa.nome} foi validado com sucesso!")

            ServidorCurso.validarMatricula()
        } else {

            println("🚫 Cadastro de ${pessoa.nome} não foi validado!")
        }
    }


    companion object ValidadorCadastro {

        fun cadastroAprovado(pessoa: Pessoa): Boolean {

            if (pessoa.idade < 18) {
                println("🚫 ${pessoa.nome} menor de idade!")
                return false
            } else {
                ServidorCurso.validarMatricula()
                return true
            }
        }
    }
}

object ServidorCurso {

    var totalMatriculas = 0
        private set

    fun validarMatricula() {
        totalMatriculas++
    }

    fun mostrarEstatisticas() {
        println("Total de matrículas validadas: $totalMatriculas")
    }
}

fun main() {

    val aluno1 = Pessoa("Henrique de Souza Mello", 22, "123.456.789-00")
    val aluno2 = Pessoa("Maria da Silva", 17, "987.654.321-00")

    val curso1 = CursoProgramacao("Java")
    val curso2 = CursoProgramacao("Python")
    val curso3 = CursoProgramacao("Kotlin")

    curso1.realizarCadastro(aluno1)
    curso1.realizarCadastro(aluno2)
    curso1.validarMatricula(aluno2)
    curso1.validarMatricula(aluno1)

}