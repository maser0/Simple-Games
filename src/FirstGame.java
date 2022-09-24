import java.util.Random;
import java.util.Scanner;



public class FirstGame {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        boolean stilGuessing = true;
        while (stilGuessing){
            System.out.println("Zgadnij liczbe, którą wylosowałem od 1 do 100");
            int userGuess = scanner.nextInt();

            if(userGuess > numberToGuess) {
                System.out.println("Za dużo");
            } else if (userGuess < numberToGuess){
                System.out.println("za mało");
            } else if ( userGuess == numberToGuess) {
                System.out.println("Brawo ! Zgadłeś");
                stilGuessing = false;
            }
        }



    }


}