package exercicio1.entities

import kotlin.math.pow
import kotlin.math.sqrt

class Retangulo {
    var width = 0.0
    var height = 0.0

    fun area(): Double = width * height

    fun perimeter(): Double = width.times(2.0) + height.times(2.0)

    fun diagonal(): Double = sqrt((width.pow(2) + height.pow(2)))

}