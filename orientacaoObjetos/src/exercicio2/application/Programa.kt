package exercicio2.application

import exercicio2.entities.Funcionario
import java.util.*

fun main() {
    Locale.setDefault(Locale.US)

    val funcionario = Funcionario()

    print("Name: ")
    funcionario.name = readln()
    print("Gross salary: ")
    funcionario.grossSalary = readln().toDouble()
    print("Tax: ")
    funcionario.tax = readln().toDouble()

    println("Employee: $funcionario")

    print("Which percentage to increase salary? ")
    val percentage = readln().toDouble()
    funcionario.increaseSalary(percentage)

    print("Updated data: $funcionario")
}