package activities.tasksheets;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";
        char charInput[] = { 'm', 'a', 'm' };

        if (isPalindrome(input)) {
            System.out.println("The " + input + " is Palindrome");
        } else {
            System.out.println("The " + input + " is not Palindrome");
        }

        if (isPalindrome(charInput)) {
            System.out.println("The " + (new String(charInput)) + " is Palindrome");
        } else {
            System.out.println("The " + (new String(charInput)) + " is not Palindrome");
        }
    }

    public static boolean isPalindrome(String input) {
        char arrayInput[] = input.toCharArray();
        for (int x = 0; x < arrayInput.length; x++) {
            
            if (arrayInput[x] != arrayInput[arrayInput.length - x - 1]) {
                return false;
            }

        }
        return true;

    }

    public static boolean isPalindrome(char input[]) {
        int length = input.length;
        for (int x = 0; x < length; x++) {

            if (input[x] != input[input.length - x - 1]) {
                return false;
            }

        }
        return true;
    }

}