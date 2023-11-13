package Recursion;

import java.util.Scanner;

// Problem Statement: Given a number X,  print its factorial.

public class four {

    public static int factorial(int n ){
        if (n==0) return 1;
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(factorial( n));
    }
    
}
