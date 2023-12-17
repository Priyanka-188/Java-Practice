import java.util.Scanner;
/* Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

       1
      2 2
     3 3 3
    4 4 4 4 
     */
class trianglePattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n =sc.nextInt();

        for(int row=1; row<=n ; row++){
            for(int spc = n-row ; spc>0; spc--){
                System.out.print(" ");
            }
            for(int col=1; col<=row ; col++){
                System.out.print(row+ " ");
            }
            System.out.println();
        }
    }
}