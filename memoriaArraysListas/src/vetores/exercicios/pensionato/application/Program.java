package vetores.exercicios.pensionato.application;

import vetores.exercicios.pensionato.entities.Inquilino;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Inquilino[] quartos = new Inquilino[9];

        System.out.print("Quantos quartos vão ser alugados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Aluguel #"+(1+i));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            quartos[quarto] = new Inquilino(nome, email, quarto);
        }

        System.out.println("Quartos ocupados: ");
        for(Inquilino quarto: quartos) {
            if(quarto != null) {
                System.out.println(quarto.toString());
            }
        }

        sc.close();
    }
}
