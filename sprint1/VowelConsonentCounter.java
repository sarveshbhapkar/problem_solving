import java.util.Scanner;
// Counting Vowels and Consonants in a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to count vowels and consonants in a given string.
// Example:
// Input: string = "hello world"
// Output: Vowels: 3, Consonants: 7
// Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).

public class VowelConsonentCounter {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the string : ");

    String input= sc.nextLine().toLowerCase();

    int vowelCount=0;
    int consonentCounter=0;

    String vowels ="aeiou";

    for(int i=0;i<input.length();i++){
        char ch=input.charAt(i);

        if(ch>='a' && ch<'z'){
if(vowels.indexOf(ch) != -1){
    vowelCount++;
}else{
    consonentCounter++;
}
        }
    }
    System.out.println("number of vowels :"+vowelCount);
    System.out.println("number of consonent :"+consonentCounter);

    }
}
