package Patterns;

import java.util.Scanner;
public class ten {

    public static void upperTriangle(int n){
        for(int row=1 ; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void lowerTriangle(int n){
        for(int row=1 ; row<n; row++){
            for(int col=n-row ; col>=1; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        upperTriangle(n);
        lowerTriangle(n);
    }
}
