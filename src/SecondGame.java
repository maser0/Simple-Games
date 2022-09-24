import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SecondGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> userNumbers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int numberToDraw = random.nextInt(1, 49);
            numbers.add(numberToDraw);
        }
//        System.out.println(numbers);


        while (userNumbers.size() < 6) {
            System.out.println("Podaj 6 liczb od 1 do 49");
            int userNumber = scanner.nextInt();
            if (userNumber < 50) {
                userNumbers.add(userNumber);

            } else if(userNumber > 50) {
                System.out.println("Podałeś za duza liczbe");
            }


        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.contains(userNumbers.get(i))) {
                System.out.println("Trafiłes " + userNumbers.get(i));
            }
            ;

        }
        System.out.println(numbers);
        System.out.println(userNumbers);
    }

}

