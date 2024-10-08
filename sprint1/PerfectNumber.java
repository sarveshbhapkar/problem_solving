import java.util.Scanner;

// Checking for Perfect Numbers
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to determine if a number is a perfect number.
// Example:
// Input: number = 28
// Output: Perfect Number
// Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.

public class PerfectNumber {
     public static boolean isPerfectNumber(int num) {
        int sum = 0;

        // Find divisors and calculate their sum
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // A perfect number is equal to the sum of its proper divisors
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
