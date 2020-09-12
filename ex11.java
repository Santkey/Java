import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę użytkowników:");
        int nubmerOfUsers = scanner.nextInt();
        int counter = 1;

        while (counter <= nubmerOfUsers){
            System.out.println("Uzytkownik" + counter++);
        }
    }
}
