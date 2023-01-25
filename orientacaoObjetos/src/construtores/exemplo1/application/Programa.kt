package construtores.exemplo1.application

import construtores.exemplo1.entities.Produto
import java.util.*

fun main() {
    Locale.setDefault(Locale.US)

    println("Enter product data: ")
    print("Name: ")
    val name = readln()
    print("Price: ")
    val price = readln().toDouble()

    val produto = Produto(name, price)
    println("Product data: $produto")
    println()
    print("Enter the number of products to be added in stock: ")
    var quantity = readln().toInt()
    produto.addProducts(quantity)

    println("Updated data: $produto")
    println()

    print("Enter the number of products to be removed from stock: ")
    quantity = readln().toInt()
    produto.removeProducts(quantity)
    println("Updated data: $produto")

}