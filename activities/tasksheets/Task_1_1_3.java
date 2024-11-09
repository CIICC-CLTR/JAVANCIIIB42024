package activities.tasksheets;

public class Task_1_1_3 {

    Task_1_1_3() {

    }

    public static void oddOrEven(int check_number, String message) {
        for (int x = 0; x <= check_number; x++)
            System.out.println(message = (x % 2 == 0) ? x + " is even number" : x + " is odd number");
    }

}
