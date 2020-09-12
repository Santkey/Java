import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Imię:");
        String name = scanner.nextLine();
        System.out.println("Podaj Nazwisko:");
        String lastname = scanner.nextLine();
        System.out.println("Podaj Wiek:");
        byte age = scanner.nextByte();
        System.out.println("Czy jesteś studentem?");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Podaj formę zatrudnienia (D/E)");
        char employmentForm = scanner.next().charAt(0);


        System.out.println("##############");
        System.out.println("Name:");
        System.out.println(name);
        System.out.println("Last name:");
        System.out.println(lastname);
        System.out.println("Age:");
        System.out.println(age);
        System.out.println("Is Student:");
        System.out.println(isStudent);
        System.out.println("Employment Form:");
        System.out.println(employmentForm);
        System.out.println("##############");
    }
}