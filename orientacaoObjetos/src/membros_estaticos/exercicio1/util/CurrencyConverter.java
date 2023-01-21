package membros_estaticos.exercicio1.util;

public class CurrencyConverter {

    public static final double IOF = 1.06;
    public static double dollarToReais(double dollarPrice, double dollarBought) {
        return dollarPrice * dollarBought * IOF;
    }
}
