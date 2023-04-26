package abstrata.exercicio2.application;

import abstrata.exercicio2.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Digite o numero de pessoas: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados pessoa #" + i + ":");
            System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
            char tipo = sc.nextLine().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            sc.nextLine();
            if(tipo == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                sc.nextLine();
                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Numero de funcionarios: ");
                int funcionarios = sc.nextInt();
                sc.nextLine();
                list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double impostoTotal = 0.0;
        for(Pessoa p : list) {
            impostoTotal += p.imposto();
            System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.imposto()));
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", impostoTotal));

        sc.close();
    }
}
