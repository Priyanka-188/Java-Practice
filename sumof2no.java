import java.util.Scanner;
//  Write a Java program to print the sum of two numbers after taking from user as input.
public class sumof2no{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The sum of "+num1+ " and "+num2+ " is "+(num1+num2));
    }
}