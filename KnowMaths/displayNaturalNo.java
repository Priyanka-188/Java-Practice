//  Write a Java program to display the first 10 natural numbers.
import java.util.Scanner;
class displayNaturalNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("The first "+n+" natural numbers are: ");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}