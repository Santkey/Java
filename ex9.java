import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy jesteś studentem?");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();

        if(isStudent && age <= 26)
        {
            System.out.println("Należy Ci się ulga studencka.");
        } else {
            System.out.println("Niestety nie należy Ci się ulga studencka.");
        }
    }
}