package construtores.exercicio1.application

import construtores.exercicio1.entities.Conta
import java.util.*

fun main() {
    Locale.setDefault(Locale.US)

    val conta: Conta

    print("Enter account number: ")
    val number = readln().toInt()
    print("Enter account holder: ")
    val name = readln()
    print("Is there an initial deposit(y/n)?")
    val isADeposit = readln()
    if(isADeposit == "y") {
        print("Enter initial deposit value: ")
        val deposit = readln().toDouble()
        conta = Conta(number, name, deposit)
    } else {
        conta = Conta(number, name)
    }
    println()
    println("Account data:")
    println(conta)
    println()
    print("Enter a deposit value: ")
    val deposito = readln().toDouble()
    conta.deposito(deposito)
    println("Updated account data:")
    println(conta)
    println()
    print("Enter a withdraw value: ")
    val saque = readln().toDouble()
    conta.saque(saque)
    println("Updated account data:")
    println(conta)
}