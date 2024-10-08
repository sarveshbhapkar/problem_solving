import java.util.Scanner;

// Reversing a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to reverse a given string.
// Example:
// Input: string = "programming"
// Output: "gnimmargorp"
// Explanation: The reversed string of "programming" is "gnimmargorp".

public class revString {
    
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        
        System.out.println("Reversed string: " + reversed);
        
        
        scanner.close();
}
}
