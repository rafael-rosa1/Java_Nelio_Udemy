package exemplo2.entities

class Produto {
    var name: String = ""
    var price: Double = 0.0
    var quantity: Int = 0

    fun totalValueInStock() = price * quantity

    fun addProducts(quantity: Int) {
        this.quantity += quantity
    }

    fun removeProducts(quantity: Int) {
        this.quantity -= quantity;
    }

    override fun toString(): String {
        return "$name, $ ${String.format("%.2f", price)}, $quantity units, Total: $ ${String.format("%.2f", totalValueInStock())}"
    }

}