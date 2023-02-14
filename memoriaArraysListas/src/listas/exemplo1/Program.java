package listas.exemplo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Rafael");
        list.add("Ronaldo");
        list.add("Valentina");
        list.add("Vampeta");
        list.add("Pedro");
        list.add("Paula");
        list.add(2, "Lucas");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");
//        list.remove(1);
//        list.remove("Rafael");
        list.removeIf(x -> x.charAt(0) == 'P');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------------");

        System.out.println("Index of Valentina: " + list.indexOf("Valentina"));
        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').toList();
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(name);

    }
}
