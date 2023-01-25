package construtores.exemplo1.entities

class Produto(private var name: String = "", private var price: Double = 0.0, private var quantity: Int = 0) {

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getPrice(): Double {
        return price
    }

    fun setPrice(price: Double) {
        this.price = price
    }

    fun getQuantity(): Int {
        return quantity
    }

    private fun totalValueInStock() = price * quantity

    fun addProducts(quantity: Int) {
        this.quantity += quantity
    }

    fun removeProducts(quantity: Int) {
        this.quantity -= quantity;
    }

    override fun toString(): String {
        return "$name, $ ${String.format("%.2f", price)}, $quantity units, Total: $ ${
            String.format(
                "%.2f",
                totalValueInStock()
            )
        }"
    }

}