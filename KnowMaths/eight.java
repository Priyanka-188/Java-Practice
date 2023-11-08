package KnowMaths;
import java.util.Scanner;
// Problem Statement: Find the gcd of two numbers.
public class eight {
    public static int Gcd(int n1, int n2){
        if(n2==0){
            return n1;
        }
        else{
            return Gcd(n2, n1 % n2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = Gcd(num1,num2);
        System.out.println("The gcd of "+num1+" and "+num2+" is: "+gcd);

    }
}
