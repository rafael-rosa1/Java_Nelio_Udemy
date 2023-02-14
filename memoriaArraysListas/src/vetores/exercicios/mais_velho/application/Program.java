package vetores.exercicios.mais_velho.application;

import vetores.exercicios.mais_velho.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Person[] persons = new Person[n];

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            persons[i] = new Person(name, age);
        }

        int maiorIdade = 0;
        int indexMaiorIdade = 0;

        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getAge() > maiorIdade) {
                maiorIdade = persons[i].getAge();
                indexMaiorIdade = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + persons[indexMaiorIdade].getName());

        sc.close();
    }
}
