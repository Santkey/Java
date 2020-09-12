import java.util.Random;

public class ex17 {
    public static void main(String[] args) {
        Random random = new Random();
        int level = random.nextInt(3);
        if (level == 0) {
            System.out.println("Developer");}
            else if (level == 1) {
                System.out.println("Manager");
            }
            else {
                System.out.println("Manager");
            }
        }
    }
