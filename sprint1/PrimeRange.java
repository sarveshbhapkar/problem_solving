import java.util.Scanner;

// Finding Prime Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find all prime numbers within a given range.
// Example:
// Input: range = [10, 30]
// Output: [11, 13, 17, 19, 23, 29]
// Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.

public class PrimeRange {
    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimesInRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        findPrimesInRange(start, end);
    }
}
