package exercicio1.application

import exercicio1.entities.Retangulo
import java.util.*

fun main() {
    Locale.setDefault(Locale.US)

    val retangulo = Retangulo()

    println("Enter rectangle width and height")
    retangulo.width = readln().toDouble()
    retangulo.height = readln().toDouble()

    println("AREA = ${retangulo.area()}")
    println("PERIMETER = ${retangulo.perimeter()}")
    println("DIAGONAL = ${retangulo.diagonal()}")
}