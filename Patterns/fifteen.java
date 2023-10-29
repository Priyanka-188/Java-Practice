package Patterns;

import java.util.Scanner;

public class fifteen {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row=1; row<=n ; row++){
            for(int spc = n-row; spc>=1 ; spc--){
                System.out.print(" ");
            }
            char ch ='A';
            int breakpoint = (2*row+1)/2;
            for(int col=1 ; col <= 2*row-1; col++){
                System.out.print(ch);
                if(col<breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
}


/*
 * 
 Enter number of rows: 6
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA
 */