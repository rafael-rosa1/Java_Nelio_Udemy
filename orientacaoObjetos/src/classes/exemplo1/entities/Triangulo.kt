package classes.exemplo1.entities

import kotlin.math.sqrt

class Triangulo {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0

    fun area(): Double {
        val p = (a + b + c) / 2.0
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }
}