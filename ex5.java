import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int value = scanner.nextInt();

        boolean isDivisibleBy2 = value % 2 == 0;
        System.out.println("Czy podana liczba jest podzielna przez 2?");
        System.out.println(isDivisibleBy2);

        boolean isDivisibleBy5 = value % 5 == 0;
        System.out.println("Czy podana liczba jest podzielna przez 5?");
        System.out.println(isDivisibleBy5);
    }
}
