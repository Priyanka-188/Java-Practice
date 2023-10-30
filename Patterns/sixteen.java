package Patterns;

import java.util.Scanner;
public class sixteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){
            int start;
            if(row%2 != 0){
                start =1;
            }
            else{
                start =0;
            }
            for(int col=1; col<=row; col++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}

/*
Enter number of rows: 6
1
01
101
0101
10101
010101
 */
