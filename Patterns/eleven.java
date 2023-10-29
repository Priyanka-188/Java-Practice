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

/*
 * 
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */