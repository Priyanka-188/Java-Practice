package Patterns;

import java.util.Scanner;

public class nine {

    public static void upperTriangle(int n){
        for(int row=1; row<=n; row++){
            for(int spc = n-row; spc >=1; spc-- ){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= 2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lowerTriangle(int n){
        for(int row = 1 ; row <= n; row++){
            for(int spc = 1; spc < row; spc++){
                System.out.print(" ");
            }
            for(int col = 1; col <= 2*(n-row)+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        upperTriangle(n);
        lowerTriangle(n);

    }
}
