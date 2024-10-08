public class lcm {
    

//     Finding the Least Common Multiple (LCM)
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find the LCM of two numbers.
// Example:
// Input: a = 12, b = 15
// Output: 60
// Explanation: The LCM of 12 and 15 is 60.


    public static int gcd(int a,int b){
        while(b !=0){
            int temp=b;
            b=a %b;
             a=temp;

        }
        return a;

    }

        public static int lowest(int a,int b){
            return (a*b)/gcd(a, b);
        }

        public static void main(String[] args) {
            int num1=13;
            int num2=43;

            int result=lowest(num1, num2);

            System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + result);


        }
    
}
