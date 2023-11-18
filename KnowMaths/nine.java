package KnowMaths;
// Write a Java program to display the cube of the given number up to an integer.
import java.util.Scanner;
class nine{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
           System.out.println("The cube of "+i+ " is " + (i*i*i));
        }
    }
}