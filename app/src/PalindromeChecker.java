import java.util.Scanner;
public class PalindromeChecker {


    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Reverse the string
        String reversed = reverseString(str);

        // Check if palindrome using conditional statement
        if (str.equals(reversed)) {
            // Result: It is a palindrome
            System.out.println(str);
            System.out.println("It is a palindrome? true");
        } else {
            // Result: It is not a palindrome
            System.out.println(str);
            System.out.println("It is a palindrome? false");
        }

        // Close Scanner resource
        sc.close();
    }

    // Helper method to reverse a string
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}