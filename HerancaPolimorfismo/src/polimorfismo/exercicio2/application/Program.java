package polimorfismo.exercicio2.application;

import polimorfismo.exercicio2.entities.ImportedProduct;
import polimorfismo.exercicio2.entities.Product;
import polimorfismo.exercicio2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char type = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            if(type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                LocalDate manufactured = LocalDate.parse(date, fmt1);
                products.add(new UsedProduct(name, price, manufactured));
            } else if (type == 'i') {
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                sc.nextLine();
                products.add(new ImportedProduct(name, price, fee));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

    }
}
