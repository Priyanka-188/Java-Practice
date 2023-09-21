import java.util.Scanner;
//  Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
/*The pattern like :
1
2 3
4 5 6
7 8 9 10  */
class rightAngleTriIncby1Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int count =1;

        for(int row = 1; row<=n; row++){
            for(int col=1;col<=row;col++){
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
        }
    }
}