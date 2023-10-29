package Patterns;

import java.util.Scanner;
public class eleven {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int count =1;
        for(int row=1; row<=n ;row++){
            for(int col=1 ; col<=row; col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
}
