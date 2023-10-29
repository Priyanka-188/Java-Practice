package Patterns;

import java.util.Scanner;

public class twelve {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n = sc.nextInt();

    for(int row=1; row<=n ; row++){
        char ch = 'A';
        for(int col=1; col<=row; col++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
}

/*
 * 
 Enter number of rows: 5
A
AB
ABC
ABCD
ABCDE
 */
