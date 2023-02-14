package vetores.exercicios.dados_pessoas.application;

import vetores.exercicios.dados_pessoas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        double maiorAltura = 0.0;
        double menorAltura = 10.0;

        for (int i = 0; i < pessoas.length; i++) {
        System.out.print("Altura da "+(i+1)+"ª pessoa: ");
        double altura = sc.nextDouble();
        System.out.print("Genero da "+(i+1)+"ª pessoa(M/F): ");
        String genero = sc.next().toUpperCase();
        pessoas[i] = new Pessoa(altura, genero);
        if(altura > maiorAltura) {
            maiorAltura = altura;
        }else if(altura < menorAltura) {
            menorAltura = altura;
            }
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);


        double somaAlturaMulheres = 0.0;
        double qtdeMulheres = 0.0;
        int qtdeHomens = 0;
        for(Pessoa pessoa: pessoas) {
            if(pessoa.getGenero().equals("F")) {
                somaAlturaMulheres += pessoa.getAltura();
                qtdeMulheres++;
            } else {
                qtdeHomens++;
            }
        }
        System.out.printf("Media das alturas das mulheres = %.2f%n", somaAlturaMulheres/qtdeMulheres);
        System.out.print("Numero de homens = " + qtdeHomens);
        sc.close();
    }
}
