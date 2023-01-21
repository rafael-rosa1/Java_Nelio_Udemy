package classes.exemplo1.application

import classes.exemplo1.entities.Triangulo

fun main() {

    val x = Triangulo();
    val y = Triangulo();

    println("Enter the measures of triangle X: ")
    x.a = readln().toDouble()
    x.b = readln().toDouble()
    x.c = readln().toDouble()

    println("Enter the measures of triangle Y: ")
    y.a = readln().toDouble()
    y.b = readln().toDouble()
    y.c = readln().toDouble()

    val areaX = x.area()

    val areaY = y.area()

    println("Triangle X area: ${areaX}")
    println("Triangle Y area: ${areaY}")

    if (areaX > areaY) {
        println("Larger area: X")
    } else {
        println("Larger area: Y")
    }
}