package Recursion;

import java.util.Scanner;

// Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

public class three {

    public static int Sum(int n ){
        if(n==0) return 0;
        else{
            return n+ Sum(n-1);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(Sum( n));
    }
    
}
