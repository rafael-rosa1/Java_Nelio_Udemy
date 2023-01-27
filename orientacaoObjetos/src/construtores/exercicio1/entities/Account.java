package construtores.exercicio1.entities;

public class Account {

    private final int numero;
    private String nome;
    private double saldo;

    public Account(int numero, String nome, double initialDeposit) {
        this.numero = numero;
        this.nome = nome;
        deposito(initialDeposit);
    }

    public Account(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor){
        double taxa = 5.00;
        saldo = saldo - valor - taxa;
    }

    public String toString() {
        return "Account " + numero + ", Holder: " + nome + ", Balance: $ " + saldo;
    }
}
