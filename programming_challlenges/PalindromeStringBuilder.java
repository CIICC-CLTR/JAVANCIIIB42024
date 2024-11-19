package programming_challlenges;

 

public class PalindromeStringBuilder {
   
    public static void main(String[] args) {

        String input = "nasabayabasan";
       
        System.err.println(new PalindromeStringBuilder().wordPalindrome(input));

    }


    public String wordPalindrome(String input){

        if(!isPalindrome(input)){
            return input +" is not Palindrome";
        }

        return input + " is Palindrome";
    }

    public boolean isPalindrome(String input){

        StringBuilder word = new StringBuilder(input).reverse();
        // word.toString(input).toString();

        if(!input.equals(word.toString())){
            return false;
        }

        
        return true;
    }

    // String input = "madam";
    // char charInput[] = { 'm', 'a', 'm' };

    // if (isPalindrome(input)) {
    // System.out.println("The " + input + " is Palindrome");
    // } else {
    // System.out.println("The " + input + " is not Palindrome");
    // }

    // if (isPalindrome(charInput)) {
    // System.out.println("The " + (new String(charInput)) + " is Palindrome");
    // } else {
    // System.out.println("The " + (new String(charInput)) + " is not Palindrome");
    // }

    // public static boolean isPalindrome(String str) {
    // int length = str.length();

    // for (int i = 0; i < length; i++) {
    // if (str.charAt(i) != str.charAt(length - i - 1)) {
    // return false;
    // }
    // }
    // return true;
    // }
    // public static boolean isPalindrome(String input) {
    // char arrayInput[] = input.toCharArray();
    // for (int x = 0; x < arrayInput.length; x++) {

    // if (arrayInput[x] != arrayInput[arrayInput.length - x - 1]) {
    // return false;
    // }

    // }
    // return true;

    // }

    // public static boolean isPalindrome(char input[]) {
    // int length = input.length;
    // for (int x = 0; x < length; x++) {

    // if (input[x] != input[input.length - x - 1]) {
    // return false;
    // }

    // }
    // return true;
    // }

}