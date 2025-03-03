package br.com.audrey.mercadolivrocursokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//aqui inicia a nossa aplicacao com essa anotacao
@SpringBootApplication
class MercadoLivroCursoKotlinApplication

//funçao primária que inicia a aplicacao
fun main(args: Array<String>) {
    println("Começando meu projeto Kotlin, Yahwe é maravilhoso!!!")
    runApplication<MercadoLivroCursoKotlinApplication>(*args)
}
