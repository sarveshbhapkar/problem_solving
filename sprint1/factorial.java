public class factorial {
    


//     Finding the Factorial of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to compute the factorial of a given number.
// Example:
// Input: number = 5
// Output: 120
// Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.
   

static int factorialNum(int n){
        int res=1;

        for(int i=2;i<=n;i++)
            res *=i;
            return res;
        


    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("factorial of "+num +" is "+factorialNum(5));
    }
}
