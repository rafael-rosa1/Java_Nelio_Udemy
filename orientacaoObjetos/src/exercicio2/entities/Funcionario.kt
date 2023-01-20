package exercicio2.entities

class Funcionario {

    var name = ""
    var grossSalary = 0.0
    var tax = 0.0

    fun netSalary() = grossSalary - tax

    fun increaseSalary(percentage: Double) {
        grossSalary += (grossSalary * percentage)/100
    }

    override fun toString(): String {
        return "$name, $ ${netSalary()}"
    }
}