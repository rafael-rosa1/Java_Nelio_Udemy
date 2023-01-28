package vetores.exemplo1

import java.util.*

fun main() {
    Locale.setDefault(Locale.US)

    val n = readln().toInt()
    val vect = DoubleArray(n)

    for (index in 0 until n) {
        vect[index] = readln().toDouble()
    }

    var soma = 0.0;

    for(element in vect) {
        soma += element
    }

    val media = soma/n

    println("AVERAGE HEIGHT: $media")

}