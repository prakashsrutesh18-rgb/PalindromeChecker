/**
 * UC1: Application Entry & Welcome Message
 * 
 * Goal: Display a welcome message and app details at startup.
 * 
 * This class demonstrates:
 * - Class as a container for application logic
 * - Main method as entry point with signature: public static void main(String[] args)
 * - Static keyword for JVM invocation without object creation
 * - Console output using System.out.println()
 */

public class UseCase1PalindromeCheckerApp {
    
    // Application constants
    private static final String APP_NAME = "Palindrome Checker";
    private static final String APP_VERSION = "1.0.0";
    
    /**
     * Main method - Entry point of the Java application
     * JVM invokes this method to start the application
     * 
     * @param args Command line arguments (not used in UC1)
     */
    public static void main(String[] args) {
        // Display welcome message and app details
        displayWelcomeMessage();
        
        // Application flow continues or exits
        System.out.println("\nApplication ready for palindrome checking...");
    }
    
    /**
     * Displays the welcome message and application details
     * Demonstrates console output using System.out.println()
     */
    private static void displayWelcomeMessage() {
        System.out.println("=".repeat(50));
        System.out.println("Welcome to " + APP_NAME);
        System.out.println("Version: " + APP_VERSION);
        System.out.println("=".repeat(50));
    }
}
