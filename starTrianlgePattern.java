/* Write a Java program to generate the following * triangles.
 * Input the number: 6
Expected Output :

******
*****
****
***
**
*
 */
import java.util.Scanner;
class starTrianlgePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of row: ");
        int n = sc.nextInt();

    
        for(int row=n; row>=1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}