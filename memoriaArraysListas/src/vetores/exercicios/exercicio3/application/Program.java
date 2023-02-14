package vetores.exercicios.exercicio3.application;

import vetores.exercicios.exercicio3.entitites.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Person(name, age, height);
        }

        double sumHeight = 0;
        int under16 = 0;
        for (int i = 0; i < vect.length; i++) {
            sumHeight += vect[i].getHeight();
            if(vect[i].getAge() < 16) {
                under16++;
            }
        }

        System.out.print("Altura média: ");
        double heigthAvg = sumHeight/vect.length;
        System.out.printf("%.2f%n",heigthAvg);

        System.out.print("Pessoas com menos de 16 anos: ");
        double under16Percentage = under16 / (vect.length*1.0) * 100.0;
        System.out.printf("%.1f%% %n", under16Percentage);
        for (Person person : vect) {
            if(person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }
        sc.close();
    }
}
