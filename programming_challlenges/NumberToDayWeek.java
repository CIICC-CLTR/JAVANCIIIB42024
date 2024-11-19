package programming_challlenges;
import java.util.Scanner;
public class NumberToDayWeek {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double number = 0.0;

    System.out.print("\nEnter numbers [1 to 7] to convert for Day in a Week: ");
    number = scan.nextDouble();

    System.out.println(toDay(number));

   
    }

    public static String toDay(double num){
        String day=""; int n = (int)num;

        if ((isValidChoice(num))) {
            switch ((int)num) {
                case 1: day = n + " is equivalent to Monday\n";break;
                case 2: day = n + " is equivalent to Tuesday\n";break;
                case 3: day = n + " is equivalent to Wednesday\n";break;
                case 4: day = n + " is equivalent to Thursday\n";break;
                case 5: day = n + " is equivalent to Friday\n";break;
                case 6: day = n + " is equivalent to Saturday\n";break;
                case 7: day = n + " is equivalent to Sunday\n";break;
                default: day = n + "is invalid input\n";break;
            }
            
        }
        return day;
    }

    public static boolean isValidChoice(double num){

      if((int) num<=7 || (int) num>=1)

        return true;
    
    return false;
}
}
