package vetores.exemplo2.application

import vetores.exemplo2.entities.Product
import java.util.*

fun main() {
    Locale.setDefault(Locale.US);

    val n = readln().toInt()

    val vetor = arrayOfNulls<Product>(n)

    for(index in vetor.indices) {
        val nome = readln()
        val preco = readln().toDouble()
        vetor[index] = Product(nome, preco)
    }

    var soma = 0.0

    for(item in vetor) {
        soma += item!!.price
    }

    val media = soma / vetor.size

    println("AVERAGE PRICE = $media")

}