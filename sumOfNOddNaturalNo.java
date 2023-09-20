// Write a Java program that displays the sum of n odd natural numbers.
import java.util.Scanner;
class sumOfNOddNaturalNo{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Input number of terms: ");
      int n = sc.nextInt();
      System.out.println("The odd numbers are:");
      int sum=0;
      for(int i=1; i<=n ;i++){
        System.out.println(2*i-1);
        sum = sum+ 2*i-1;
      }
      System.out.println("The sum of odd natural numbers upto "+n+ " is "+sum);
    }
}