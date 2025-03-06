package fundamentos.statics

class GrupoWhatsApp(val nome: String) {

    //lista de membros será do tipo lista - primeiro paasso
    private val membros = mutableListOf<String>()

    fun adicionarMembro(membro: String) {
        //adicionando membro na lista de membros
        membros.add(membro)
        println(" ✅ $membro entrou no grupo '$nome'!")
    }

    fun enviarMensagem(mensagem: String) {

        if (mensagemAprovada(mensagem)) {

            println("💬 [$nome] mensagem enviada: $mensagem")
            ServidorWhatsApp.enviarMensagem() //notifica o servidor
        } else {

            println("🚫 Mensagem bloqueada por conter palavras impróprias!")
        }
    }

    companion object Moderacao {

        private val palavrasProibidas = listOf("palavrão", "spam", "besta", "boboca", "bolsominion")

        fun mensagemAprovada(mensagem: String): Boolean {

            return palavrasProibidas.none { mensagem.contains(it, ignoreCase = true) }
        }
    }
}


object ServidorWhatsApp {
    var totalMensagens = 0
    private set

    fun enviarMensagem() {
        totalMensagens++
    }

    fun mostrarEstatisticas() {
        println("Total de mensagens enviadas: $totalMensagens")
    }
}


fun main() {

    val grupoFamilia = GrupoWhatsApp("Família")
    val grupoTrabalho = GrupoWhatsApp("Trabalho")

    grupoFamilia.adicionarMembro("Mãe")
    grupoFamilia.adicionarMembro("Pai")
    grupoFamilia.adicionarMembro("Heitor")
    grupoFamilia.adicionarMembro("Henrique")

    grupoTrabalho.adicionarMembro("João")
    grupoTrabalho.adicionarMembro("Maria")
    grupoTrabalho.adicionarMembro("José")
    grupoTrabalho.adicionarMembro("Henrique Marinelli")
    grupoTrabalho.adicionarMembro("Luis Carlos")


    grupoFamilia.enviarMensagem("Oi, tudo bem?")
    grupoFamilia.enviarMensagem("Oi, tudo bem? palavrão")
    grupoFamilia.enviarMensagem("Oi, tudo bem? besta")
    grupoTrabalho.enviarMensagem("Oi, tudo bem? turma besta")
    grupoTrabalho.enviarMensagem("Oi, tudo bem? turma")
    grupoTrabalho.enviarMensagem("Oi, tudo bem? turma spam")
    grupoTrabalho.enviarMensagem("Vamos fazer uma trilha?")

    ServidorWhatsApp.mostrarEstatisticas()
}