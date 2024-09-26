public class gcd {
    
//     Finding the Greatest Common Divisor (GCD)
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find the GCD of two numbers.
// Example:
// Input: a = 48, b = 18
// Output: 6
// Explanation: The GCD of 48 and 18 is 6.


    static int factor(int a,int b){
        int result=Math.min(a, b);
        while(result>0){
            if(a%result==0 && b% result==0){
                break;
            }
            result--;
        }
        return result;

    }
    public static void main(String[] args) {
        int a=98,b=56;

        System.out.println("gcd of "+a+" and "+b+" is "+factor(a, b));
    }

}
