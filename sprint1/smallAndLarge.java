import java.util.Arrays;

// Finding the Largest and Smallest Numbers in an Array
// Difficulty: Easy
// Topics: Basic Programming, Arrays
// Description: Write a program to find the largest and smallest numbers in an array.
// Example:
// Input: array = [4, 7, 1, 8, 5]
// Output: Largest: 8, Smallest: 1
// Explanation: The largest number in the array is 8 and the smallest is 1.

public class smallAndLarge {
    
    public static void findLargeAndSmall(){
        int [] arr={98,76,45,34,32,12,34,5,6};

        int small=arr[0];
        int large=arr.length-1;

       for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }else if(arr[i]>large){
                large = arr[i];
            }
       }

       System.out.println("the smallest number is : "+small);
       System.out.println("the largest number is : "+large);
    }
    public static void main(String[] args) {
        
        findLargeAndSmall();
    }
}
