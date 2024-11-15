package programming_challlenges;

import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        double grade = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Grade: ");
        grade = scan.nextDouble();

        if (grade <= 100 && grade >= 90){System.out.println("Your " + grade + " grade is eqivalent of A");}
        else if (grade <= 89 && grade >= 80){System.out.println("Your " + grade + " grade is eqivalent of B");}
        else if (grade <= 79 && grade >= 70){System.out.println("Your " + grade + " grade is eqivalent of C");}
        else if (grade <= 69 && grade >= 60){System.out.println("Your " + grade + " grade is eqivalent of D");}
        else if (grade < 60){System.out.println("Your " + grade + " grade is eqivalent of F");}
        else{System.out.println("Please Input Valid Grade");}
            
            
    }

}
