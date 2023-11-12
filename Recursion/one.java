package Recursion;
//Print 1 to N using Recursion

import java.util.Scanner;

public class one {
    public static void print(int i,int n){
       
        System.out.println(i);
        if(i>=n){
            return ;
        }
        print(i+1, n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        print(1,n);
    }
}
