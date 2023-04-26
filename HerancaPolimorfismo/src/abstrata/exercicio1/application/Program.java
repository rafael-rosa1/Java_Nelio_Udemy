package abstrata.exercicio1.application;

import abstrata.exercicio1.entities.Circle;
import abstrata.exercicio1.entities.Rectangle;
import abstrata.exercicio1.entities.Shape;
import abstrata.exercicio1.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine().toUpperCase());
            if(shape == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                sc.nextLine();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                sc.nextLine();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                sc.nextLine();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape s : list) {
            System.out.println(String.format("%.2f", s.area()));
        }
        sc.close();
    }
}
