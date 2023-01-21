package classes.exemplo2.application

import classes.exemplo2.entities.Produto
import java.util.*

fun main() {
    Locale.setDefault(Locale.US)
    val produto = Produto()
    println("Enter product data: ")
    print("Name: ")
    produto.name = readln()
    print("Price: ")
    produto.price = readln().toDouble()
    print("Quantity in stock: ")
    produto.quantity = readln().toInt()

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