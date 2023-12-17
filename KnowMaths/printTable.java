import java.util.Scanner;
//  Write a Java program that takes a number as input and prints its multiplication table up to 10.
public class printTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        for(int i=1; i<=10 ; i++){
            int value= i*num;
            System.out.println(num+"*"+i+" = "+value);
        }
    }
}
