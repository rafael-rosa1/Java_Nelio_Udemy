public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); // elimina os espaços em branco nos cantos da string
        String s04 = original.substring(2); // pega a string a partir de determinada posição
        String s05 = original.substring(2,9); // recorta a string a partir de uma posicao ate um abaixo de outra
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        System.out.println("Original: " + original + "-");
        System.out.println("toLowerCase: " + s01 + "-");
        System.out.println("trim: " + s03 + "-");
        System.out.println("substring(2): " + s04 + "-");
        System.out.println("substring(2,9): " + s05 + "-");
        System.out.println("replace('a','x'): " + s06 + "-");
        System.out.println("replace('abc','xy'): " + s07 + "-");


        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("indexOf('bc'): " + i + "-");
        System.out.println("lastIndexOf('bc'): " + j + "-");


        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        System.out.println(vect[0]);;
        System.out.println(vect[1]);;
        System.out.println(vect[2]);;
    }
}