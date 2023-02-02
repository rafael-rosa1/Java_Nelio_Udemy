package vetores.exercicios.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];


        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        int[] negativos = new int[vect.length];
        for(int i = 0; i < negativos.length; i++) {
            if(vect[i] < 0) {
                negativos[i] = vect[i];
            }
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int negativo : negativos) {
            if(negativo != 0) {
                System.out.println(negativo);
            }
        }

    }
}
