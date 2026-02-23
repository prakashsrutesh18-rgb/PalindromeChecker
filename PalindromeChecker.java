
public class PalindromeChecker {

    private static final String APP_NAME = "Palindrome Checker";
    private static final String APP_VERSION = "1.0.0";


    public static void main(String[] args) {
        // Display welcome message and app details
        displayWelcomeMessage();

        // Application flow continues or exits
        System.out.println("\nApplication ready for palindrome checking...");
    }


    private static void displayWelcomeMessage() {
        System.out.println("=".repeat(50));
        System.out.println("Welcome to " + APP_NAME);
        System.out.println("Version: " + APP_VERSION);
        System.out.println("=".repeat(50));
    }
}