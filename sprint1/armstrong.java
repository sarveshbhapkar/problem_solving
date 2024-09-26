public class armstrong {
    

//     Calculating Armstrong Numbers
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to check if a number is an Armstrong number.
// Example:
// Input: number = 153
// Output: Armstrong Number
// Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.



    static int power(int num,int exp){
        int result=1;
        for(int i=0;i<exp;i++){
            result*=num;

        }
       return result;

    }


    static boolean isArmstrong(int num){
        int originalNum=num;
        int sum=0;
        int digits=0;

        while(originalNum !=0){
            digits++;
            originalNum/=10;

        }
        return sum == num;

    }

    public static void main(String[] args) {
        int num=153;

        if(isArmstrong(num)){
            System.out.println(num +"is armstrong number");

        }else{
            System.out.println(num+ " is not armstrong number");
        }


    }
}
