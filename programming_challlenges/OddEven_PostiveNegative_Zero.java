package programming_challlenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven_PostiveNegative_Zero {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = 0.0;

        System.out.print("\nEnter Number: ");
        System.out.println(checkNumber(scan,num));

    }

    public static String checkNumber(Scanner scan,double number){
        try {
            number = scan.nextDouble();
            return (number==0)? (int) number +" is Zero even Number\n":( (number<0)? number + " is Negative" +  oddEven(number): number + " is Postive" + oddEven(number))+"\n";     

        } catch (InputMismatchException e) {
             return ("Invalid Input");      
        }
   
    }

    public static String oddEven(double number){
        int num=0;
        num = (int) number;
        return (num%2==0)?  " Even Number":  " odd Number";
    }
 
}
