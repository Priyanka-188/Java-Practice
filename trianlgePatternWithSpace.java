import java.util.Scanner;
/* Write a Java program to generate the following * triangles.
Input the number: 6
Expected Output :

******                                                   
 *****                                                   
  ****                                                   
   ***                                                   
    **                                                   
     * 
 */
class trianlgePatternWithSpace{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();

        for(int row=n; row>0; row--){
            for(int spc = n-row; spc>0 ; spc--){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}