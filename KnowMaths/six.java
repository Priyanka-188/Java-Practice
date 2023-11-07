package KnowMaths;

import java.util.Scanner;

//Problem Statement: Given a number, print all the divisors of the number. A divisor is a number that gives the remainder as zero when divided. -------->Optimal approach

public class six {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    System.out.println("Divisors of "+n+ "are: ");
    for(int i=1; i<Math.sqrt(n);i++){
        if(n % i == 0){
            System.out.print(i +" ");
            int quiotent = n / i;
            System.out.print(quiotent+" ");
        }
    }
    if(n % Math.sqrt(n)==0){
            System.out.println((int)Math.sqrt(n));
        }
   }
}
