import java.util.Random;
import java.util.Scanner;

public class ex18 {
    public void startGame()
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int secretNumber = random.nextInt(101);

        while(true){
            score++;
            System.out.println("Zgadnij liczbe o 0 - 100");
            int number = scanner.nextInt();
            if(checkResult(number, secretNumber, score)){
                return;
            }

        }
    }
    public boolean checkResult(int number, int secretNumber, int score)
    {
        if (number == secretNumber){
            System.out.println("Gratulacje,wygrałeś");
            System.out.println("Zgadywałeś:"+ score +"raz(y)");
            return true;
        } else if(number > secretNumber){
            System.out.println("Za dużo");
        } else {
            System.out.println("Za mało");
        }
        return false;
    }

    public static void main(String[] args) {
        ex18 guessTheNumberGame = new ex18();
        guessTheNumberGame.startGame();
    }
}
