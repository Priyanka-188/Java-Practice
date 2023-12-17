/*Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
The pattern is as follows :
1
22
333
4444
 */
import java.util.Scanner;
class rightAngleTrngleWithRowNo{
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");

        int n = sc.nextInt();

        for (int row =1; row<=n; row++){
            for(int col =1 ; col<=row; col++){
                System.out.print(row+" ");
            }
            System.out.println(" ");
        }
    }
}