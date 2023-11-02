package KnowMaths;
import java.util.Scanner;

// Problem Statement: Given a number, check if it is Armstrong Number or Not.
/*
 Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.
 Example 1:
    Input:153 
    Output: Yes, it is an Armstrong Number
    Explanation: 1^3 + 5^3 + 3^3 = 153
 */

public class four {

    public static int no_of_digits(int n){
        int count = 0;
        while(n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static int sum_of_digits(int n ){
        int length = no_of_digits(n);
        int sum=0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit,length);
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = sum_of_digits(n);
        if(n == sum){
            System.out.println(n+ " is an Armstrong number.");
        }
        else{
            System.out.println(n+ " is not an Armstrong number.");
        }

    }
}

