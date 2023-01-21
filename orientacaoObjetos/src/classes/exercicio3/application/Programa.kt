package classes.exercicio3.application

import classes.exercicio3.entities.Estudante
import java.util.*

fun main() {
    Locale.setDefault(Locale.US)

    val estudante = Estudante()

    print("Nome: ")
    estudante.nome = readln()
    print("Nota1: ")
    estudante.n1 = readln().toDouble()
    print("Nota2: ")
    estudante.n2 = readln().toDouble()
    print("Nota3: ")
    estudante.n3 = readln().toDouble()

    println("FINAL GRADE = ${estudante.notaFinal()}")
    estudante.pasoou()
}