package KnowMaths;
import java.util.Scanner;

//Problem Statement: Given an integer N, write a program to count the number of digits in N.


public class one {

    public static int countDigits(int n){
        int count = 0;
        while(n!= 0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        System.out.println("The number of digits are: "+ countDigits(n));
    }
}
