import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess = 0;
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        boolean finish = false;
        String invalidInput = "Input invalid. Please enter a number 1-10.";
        do
        {
            System.out.println("Guess a number 1-10!");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10) {
                    System.out.println("Valid input " + guess + ".");
                    System.out.println("Correct answer was " + val);
                    break;
                } else {
                    System.out.println(invalidInput);
                }
            }
            else
                {
                    System.out.println(invalidInput);
                    in.next();
                }
        }while(true);
    }
}