package membros_estaticos.exemplo1.util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3.0;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

}
