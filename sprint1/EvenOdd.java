public class EvenOdd {

    // Write a program to check whether a number is even or odd.
    // Determining Even/Odd Numbers
    // Difficulty: Easy
    // Topics: Basic Programming
    // Description: Write a program to check whether a number is even or odd.
    // Example:
    // Input: number = 4
    // Output: Even
    // Explanation: Since 4 is divisible by 2, it is an even number.
    

    public void evenOdd(){
    int x=2;

    if(x%2 !=0)
    {
        System.out.println("odd");
    }else
    {
        System.out.println("even");
    }
    }

public static void main(String[] args) {
    
    EvenOdd ev =new EvenOdd();
    ev.evenOdd();
}
}
