// Write a program in Java to input n numbers from the keyboard and find their sum and average.
import java.util.Scanner;
class sumAndAverage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n ,num, sum=0 , avg = 0;
        System.out.print("Enter value of n");
        n = sc. nextInt();

        System.out.println("Enter "+n+" natural numbers: ");
        for (int i=0; i<n ; i++){
          num = sc.nextInt();
          sum= sum+num;
        }

        avg = sum/n;
        
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg );
    }
}