package Recursion;
//Print 1 to N using Recursion

import java.util.Scanner;


//Print N to 1 using Recursion
public class two {

    public static void print(int i, int n){
        if (n<i) return;
        System.out.println(n);
        print(i, n-1);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        print(1, n);
    }
}
