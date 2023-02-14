package vetores.exercicios.aprovados.application;

import vetores.exercicios.aprovados.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.media() >= 6.0) {
                System.out.println(aluno.getNome());
            }
        }

        sc.close();
    }
}
