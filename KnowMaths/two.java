package KnowMaths;
import java.util.Scanner;

//Problem Statement: Given a number N reverse the number and print it.


public class two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverese: ");
        int n = sc.nextInt();

        int num = n;
        int reverse = 0;
        while(n!=0){
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n = n/10;
        }

        System.out.println("The reverse of "+ num + " is "+reverse);
    }
}

/*
Enter a number to reverese: 123
The reverse of 123 is 321
 */
