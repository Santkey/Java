import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj typ filmu (A - akcja, F - fantasy):");
        char movieType = scanner.next().charAt(0);

        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        if(movieType != 'A' && movieType != 'F'){
            System.out.println("Zly typ filmu!");
            return;
        }

        boolean canWatchMovie = (movieType == 'A' && age >= 18) || movieType == 'F';
        System.out.println("Czy możesz obejrzeć film:");
        System.out.println(canWatchMovie? "TAK!" : "Nie, nie możesz, za młody jesteś");
    }
}
