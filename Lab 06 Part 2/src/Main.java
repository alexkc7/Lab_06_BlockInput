import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double costToDriveCent = 0;
        double distOnFullTank = 0;
        String badInput = "Input invalid. Please enter a number.";
        boolean finish = false;
        do
        {
            System.out.print("Enter the number of gallons in the tank:");
            if(in.hasNextDouble())
            {
                gallonsInTank = in.nextDouble();
                finish = true;
            }
            else
            {
                System.out.println(badInput);
                finish = false;
            }
            System.out.println("Enter your miles per gallon:");
            if(in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                finish = true;
            }
            System.out.println("Enter the price per gallon:");
            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                finish = true;
            }
            else
            {
                badInput = in.nextLine();
                        System.out.println(badInput);
            }
            costToDriveCent = pricePerGallon * 100;
            System.out.println("The cost of driving 100 miles is " + costToDriveCent);
            distOnFullTank = milesPerGallon * gallonsInTank;
            System.out.println("Your car can travel " + distOnFullTank + " miles before it runs out of gas.");
        }while(!finish);
    }
}