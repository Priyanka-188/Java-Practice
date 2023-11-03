package KnowMaths;

import java.util.Scanner;

//Problem Statement: Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as zero when divided.

public class five {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }

    }
}
