package programming_challlenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestNumber {

    private static Scanner scanner;

    public static void main(String[] args) {
       
        double num1, num2, num3= 0.0;

        num1 =checkValidnumber("Enter the First integer: ");
        num2 = checkValidnumber("Enter the Second integer: ");
        num3 = checkValidnumber("Enter the Third integer: ");
        scanner.close();

        System.out.println("\nYou entered the numbers: " + num1 + ", " + num2 + ", " + num3 +"\n");
        System.out.println(largestNumber(num1, num2, num3));
        
      
    }

    public static StringBuilder largestNumber(double num1, double num2, double num3){
            StringBuilder message = new StringBuilder();
           
            return (boolean) (num1>num2 && num1>num3)? 
            message.append(num1).append(" is the Largest number") :
            ((num2>num3)? message.append(num2).append(" is the Largest Number"): message.append(num3).append(" is the Largest Number"));
         
    }
 
    public static double checkValidnumber(String message) {
        scanner = new Scanner(System.in);
        double inputNumber = 0;

        while (true) {
            System.out.print(message);
            try {
                inputNumber =scanner.nextDouble() ;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Accepting Integer only!");
                scanner.nextLine();
            }

        }

        return inputNumber;

    }

}
