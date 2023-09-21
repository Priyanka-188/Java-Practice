// Write a Java program to display the pattern like a right angle triangle with a number.
import java.util.Scanner;
class rightAngledTrianlgePattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");

        int n = sc.nextInt();

        for (int row =1; row<=n; row++){
            for(int col =1 ; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
}

// Output
/* 

Input number of rows : 5
1  
1 2  
1 2 3
1 2 3 4
1 2 3 4 5

*/