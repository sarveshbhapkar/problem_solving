// Identifying Palindromes
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to check if a string or number is a palindrome.
// Example:
// Input: string = "radar"
// Output: Palindrome
// Explanation: "radar" reads the same backward as forward.

public class Palindrome {

    public static void isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                System.out.println("not palindrome");;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");
    }

    public static void main(String[] args) {
        isPalindrome("sboobs");
    }
}
