import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst nr 1:");
        String text1 = scanner.nextLine();

        System.out.println("Podaj tekst nr 2:");
        String text2 = scanner.nextLine();

        System.out.println("Czy obydwa teksty są takie same");
        boolean equal = text1.equals(text2);
        System.out.println(equal);

        System.out.println("Czy tekst1 dłuższy od tekstu2?");
        boolean longerThan2 = text1.length() > text2.length();
        System.out.println(longerThan2);

        System.out.println("Czy tekst1 zawiera tekst2?");
        boolean contains = text1.contains(text2);
        System.out.println("contains");

    }

}