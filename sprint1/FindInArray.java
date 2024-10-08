import java.util.Arrays;

public class FindInArray {
    
//     Finding the Largest and Smallest Numbers in an Array
// Difficulty: Easy
// Topics: Basic Programming, Arrays
// Description: Write a program to find the largest and smallest numbers in an array.
// Example:
// Input: array = [4, 7, 1, 8, 5]
// Output: Largest: 8, Smallest: 1
// Explanation: The largest number in the array is 8 and the smallest is 1.

    public static void main(String[] args) {
        
        int [] arr ={12,23,34,76,45,98,76,65};

       Arrays.sort(arr);

       int first =arr[0];

       int last =arr[arr.length-1];

       System.out.println("smallest element is : "+first);

       System.out.println("biggest element is : "+last);

        
    }
}
