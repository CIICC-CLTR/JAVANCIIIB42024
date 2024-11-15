package programming_challlenges;
import java.util.Scanner;

public class NumberToMonthDays {
    public static void main(String[] args) {

        System.out.print(new NumberToMonthDays().getMonth( "\nEnter a Month in Number: ")+"\n\n");
        
    }

    public  StringBuffer getMonth(  String prompt){
        Scanner scan = new Scanner(System.in);
        StringBuffer stringMonth = new StringBuffer();

        System.out.print(prompt);
        int month = scan.nextInt();
        
        switch (month) {
            case 1:  stringMonth.append(month).append(" is for January that has 31 days");break;
            case 2:  stringMonth.append(month).append(" is for February that has 28 days");break;
            case 3:  stringMonth.append(month).append(" is for March that has 31 days");break;
            case 4:  stringMonth.append(month).append(" is for Aoril that has 30 days");break;
            case 5:  stringMonth.append(month).append(" is for May that has 31 days");break;
            case 6:  stringMonth.append(month).append(" is for June that has 30 days");break;
            case 7:  stringMonth.append(month).append(" is for July that has 31 days");break;
            case 8:  stringMonth.append(month).append(" is for August that has 31 days");break;
            case 9:  stringMonth.append(month).append(" is for September that has 30 days");break;
            case 10:  stringMonth.append(month).append(" is for October that has 31 days");break;
            case 11:  stringMonth.append(month).append(" is for November that has 30 days");break;
            case 12:  stringMonth.append(month).append(" is for December that has 31 days");break;
            default: stringMonth.append("Invalid Input");break    ;
            }
            scan.close();
            return stringMonth;
    }
}
