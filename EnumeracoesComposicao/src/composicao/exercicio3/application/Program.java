package composicao.exercicio3.application;

import composicao.exercicio3.entities.Client;
import composicao.exercicio3.entities.Order;
import composicao.exercicio3.entities.OrderItem;
import composicao.exercicio3.entities.Product;
import composicao.exercicio3.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmtBirth = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate clientBirth = LocalDate.parse(sc.nextLine(), fmtBirth);
        Client client = new Client(clientName, clientEmail, clientBirth);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());
        Order order = new Order(status, client);
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(orderItem);
        }

        System.out.println(order);
        sc.close();
    }
}
