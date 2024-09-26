// Generating the Fibonacci Series
// Difficulty: Easy
// Topics: Basic Programming, Sequences
// Description: Write a program to generate the Fibonacci series up to a given number.
// Example:
// Input: limit = 10
// Output: [0, 1, 1, 2, 3, 5, 8]
// Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].

public class Fibonacci {

    public static void generateFibonacci(int limit) {
        int first = 0, second = 1;

        System.out.println("fibonacci series upto " + limit + ":");

        while (first <= limit) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        generateFibonacci(10);
    }
}
