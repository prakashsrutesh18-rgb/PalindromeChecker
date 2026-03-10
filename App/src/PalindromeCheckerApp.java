public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Start time
        long startTime = System.nanoTime();

        // Palindrome check
        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // End time
        long endTime = System.nanoTime();

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

        // Execution time
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}