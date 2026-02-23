import java.util.Scanner;
public class PalindromeChecker {



    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse the string using for loop
        String reversed = reverseStringUsingLoop(original);

        // Compare original and reversed using equals() method
        if (original.equals(reversed)) {
            System.out.println(original);
            System.out.println("It is a palindrome? true");
        } else {
            System.out.println(original);
            System.out.println("It is a palindrome? false");
        }

        // Close Scanner resource
        sc.close();
    }

    /**
     * Reverse string using for loop
     * Demonstrates:
     * - Loop (for loop): Iterate from end to start
     * - String Concatenation (+): Build new string character by character
     * - String Immutability: Creates new String objects at each concatenation
     *
     * @param str Original string to reverse
     * @return Reversed string
     */
    private static String reverseStringUsingLoop(String str) {
        String reversed = ""; // Empty string (String Literal)

        // For loop: iterate from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {
            // String concatenation (+): Creates new String object each time
            // Demonstrates String Immutability - old string is unchanged
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }
}