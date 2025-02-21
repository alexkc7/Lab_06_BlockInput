import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0;
        double celsius = 0;
        String badInput = "Input invalid.";
        boolean correct = false;
        do {
            System.out.println("Enter the degrees in Fahrenheit:");
            if(in.hasNextDouble()) {
                fahrenheit = in.nextDouble();
                correct = true;
                celsius = ((fahrenheit - 32) * ((double) 5 /9));
                System.out.println("The temperature in Celsius is: " + celsius + ".");
            }
            else
            {
                badInput = in.nextLine();
                System.out.println("Input invalid. Please enter a number.");
            }
        }while(!correct);
    }
}