public class Summing {
    

//     Summing Digits of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to calculate the sum of digits of a number.
// Example:
// Input: number = 1234
// Output: 10
// Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.

    public static int sumDigit(int n){
        int sum=0;

        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        
        int n=1234;

        System.out.println("sum of digits are : "+sumDigit(n));
    }
}
