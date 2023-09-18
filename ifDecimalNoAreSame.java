// Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.Scanner;
class ifDecimalNoAreSame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        num1 = Math.round(num1*1000);
        num1 = num1/1000;

        num2 = Math.round(num2*1000);
        num2 = num2 /1000;

        if(num1==num2){
            System.out.println("The 2 numbers are same utp 3 decimal points.");
        }
        else{
            System.out.println("The 2 numbers are not same.");
        }




    }
}