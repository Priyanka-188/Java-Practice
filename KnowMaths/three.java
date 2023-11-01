package KnowMaths;
import java.util.Scanner;

// Check if a number is Palindrome or Not


public class three {

    public static int reverse(int n){
        int reverse = 0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse*10 +digit;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverese: ");
        int n = sc.nextInt();

        int reverese_number = reverse(n);

        if(n == reverese_number) 
        {
            System.out.println(n + " is Palindrome.");
        }
        else{
            System.out.println(n+" is not a palindrome.");
        }


        
    }
}

/*
Enter a number to reverese: 123
The reverse of 123 is 321
 */
