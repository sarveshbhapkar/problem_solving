public class PrimeOrNot {

    // Write a program to determine if a number is prime.
    // Checking for Prime Numbers
    // Difficulty: Easy
    // Topics: Basic Programming, Number Theory
    // Description: Write a program to determine if a number is prime.
    // Example:
    // Input: number = 7
    // Output: Prime
    // Explanation: 7 has no divisors other than 1 and itself, so it is a prime
    // number.

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Only check for factors up to num / 2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       isPrime(13);
    }
}
