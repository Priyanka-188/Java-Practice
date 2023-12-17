
import java.util.Scanner;
// Write a Java recursive method to find the greatest common divisor (GCD) or HCF of two numbers.
// In programming we calculate GCD using Euclidean  method.
class GCDofTwoNo{
    public static int calculateGCD(int num1, int num2){
        if(num2>num1){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // base case : if num2 is equal to 0 , then num1 will be the GCD .
        if (num2==0)
        {
            return num1;
        }
       
         // Recursive case: calculate the GCD by recursively calling the method with new num1 and num2 .
        num1 = num1%num2;
        return calculateGCD(num1,num2);
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 2 numbers whose GCD you want to find out: ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      System.out.println("The GCD of "+num1+" and "+num2+" is "+calculateGCD(num1,num2));
    }
}