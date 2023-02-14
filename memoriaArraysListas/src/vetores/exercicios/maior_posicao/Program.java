package vetores.exercicios.maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double maiorValor = 0;
        double maiorValorPosicao = 0;

        for (int i = 0; i < vect.length; i++) {
            if(vect[i] > maiorValor) {
                maiorValor = vect[i];
                maiorValorPosicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %.1f%n", maiorValorPosicao);
        sc.close();
    }
}
