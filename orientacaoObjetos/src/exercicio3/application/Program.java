package exercicio3.application;

import exercicio3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome: ");
        student.name = sc.nextLine();
        System.out.print("Nota1: ");
        student.g1 = sc.nextDouble();
        System.out.print("Nota2: ");
        student.g2 = sc.nextDouble();
        System.out.print("Nota3: ");
        student.g3 = sc.nextDouble();

        System.out.println("FINAL GRADE: " + student.finalGrade());
        student.approved();

    }
}
