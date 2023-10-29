package Patterns;

import java.util.Scanner;
public class fourteen {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        char ch = 'A';
        for(int row=1 ; row<=n; row++){
            for(int col=1; col<=row ; col++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}

/*

Enter number of rows: 5
A   
BB  
CCC 
DDDD
EEEEE
 */