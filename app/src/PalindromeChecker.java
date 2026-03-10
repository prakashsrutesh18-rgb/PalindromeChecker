import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "civic";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to Queue and Stack
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        String input = "noon";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare dequeue and pop
        for (int i = 0; i < input.length(); i++) {

            char fromQueue = queue.remove(); // FIFO
            char fromStack = stack.pop();    // LIFO

            if (fromQueue != fromStack) {
        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {

            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}