package KnowMaths;
import java.util.Scanner;

/*
 * Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.

Examples 1 2 3 5 7 11 13 17 19 …
 */
public class seven {
    public static boolean isPrime(int n){
        boolean isprime = true;

        for(int i=2; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                isprime = false;
                break;
            }
        } 
        return isprime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n+ " is a prime number.");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
