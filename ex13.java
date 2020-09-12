import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int value = scanner.nextInt();
        int sum = 0;

        while (value != 0) {
            //sum = sum +value
            sum += value;
            System.out.println("Podaj liczbę:");
            value = scanner.nextInt();
        }
        System.out.println("Koniec programu");
        System.out.println("Suma;" + sum);
    }
}

