package lab;

import java.util.Scanner;

class PalindromeChecker {

    // Method to get the string from the user
    String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    // Method to check if the string is a palindrome
    boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create an object of the PalindromeChecker class to access methods
        PalindromeChecker checker = new PalindromeChecker();

        // Get the string input from the user
        String input = checker.getInput();

        // Check if the string is a palindrome
        boolean result = checker.isPalindrome(input);

        // Display the result
        if (result) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}