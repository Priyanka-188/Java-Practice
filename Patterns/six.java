package Patterns;
import java.util.Scanner;
public class six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row=n; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
