package vetores.exercicios.numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int totalPares = 0;
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                totalPares++;
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = ");
        System.out.println(totalPares);
        sc.close();
    }
}
