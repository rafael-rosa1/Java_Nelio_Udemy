package construtores.exercicio1.application;

import construtores.exercicio1.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();

        System.out.print("Is there an initial deposit(y/n)? ");
        String isADeposit = sc.nextLine();
        if(isADeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, nome, initialDeposit);
        } else {
            account = new Account(number, nome);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposito(deposit);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.saque(withdraw);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
