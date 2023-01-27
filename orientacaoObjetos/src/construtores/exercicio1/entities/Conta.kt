package construtores.exercicio1.entities

class Conta(private val numero: Int, private val nome: String, private val depositoInicial: Double = 0.0) {

    init {
        deposito(depositoInicial)
    }

    private var saldo = 0.0

    fun deposito(valor: Double) {
        saldo += valor
    }

    fun saque(valor: Double) {
        val taxa = 5.00;
        saldo = saldo - valor - taxa
    }

    fun getSaldo(): Double {
        return saldo
    }

    override fun toString(): String {
        return "Account $numero, Holder: $nome, Balance: $ $saldo"
    }



}