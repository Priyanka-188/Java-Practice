package Patterns;

import java.util.Scanner;

public class thirteen {
    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row = 1 ; row<=n ; row++){
            char ch = 'A';
            for(int col=1; col<=n-row+1; col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}



/*
Enter number of rows: 5
ABCDE
ABCD
ABC
AB
A
 */