package composicao.exercicio3.entities;

import composicao.exercicio3.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static DateTimeFormatter fmtMoment = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter fmtBirth = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDateTime moment = LocalDateTime.now();
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){}

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ").append(moment.format(fmtMoment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (").append(client.getBirthDate()
                .format(fmtBirth)).append(") - ").append(client.getEmail()).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : items){
            sb.append(item.getProduct().getName()).append(", $").append(String.format("%.2f",item.getPrice())).append(", Quantity: ")
                    .append(item.getQuantity()).append(", Subtotal: $").append(String.format("%.2f",item.subTotal())).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f",total()));
        return sb.toString();
    }
}
