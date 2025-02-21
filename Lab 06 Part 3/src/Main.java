import java.util.Scanner;

// rectangle info
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double perimeter = 0;
        double area = 0;
        double diagonal = 0;
        String badInput = "Input invalid. Please enter a number.";
        boolean finish = false;
        do
        {
            System.out.println("Enter the width of the rectangle.");
            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                finish = true;
            }
            else
            {
                System.out.println(badInput);
            }
            System.out.println("Enter the length of the rectangle.");

        }while(!finish);
        do
        {
            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                finish = true;
            }
            else
            {
                System.out.println(badInput);
            }
        }while(!finish);
        perimeter = (width * 2) + (length * 2);
        area = length * width;
        diagonal = Math.pow(length, 2) + Math.pow(width, 2);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The diagonal of the rectangle is" + Math.sqrt(diagonal));;
    }
}