import java.util.Arrays;

// Sorting an Array
// Difficulty: Easy
// Topics: Basic Programming, Sorting Algorithms
// Description: Write a program to sort an array of numbers in ascending order.
// Example:
// Input: array = [3, 1, 4, 1, 5, 9]
// Output: [1, 1, 3, 4, 5, 9]
// Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].

public class sort {
    
    public  static void sortArray(){

        int [] arr = {87,65,43,21,34,56,78,90};
        
        // for(int i=0 ;i<arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){

        //           arr[i] =arr[i+1];
        //           System.out.println(arr[i]);
        //     }
           
        // }

        // System.out.println(arr);/
        Arrays.sort(arr);
        System.out.println(arr);
    }
    public static void main(String[] args) {
        int [] arr = {87,65,43,21,34,56,78,90};
        sortArray();

    }
}
