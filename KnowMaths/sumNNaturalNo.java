//Sum of n natural numbers
import java.util.Scanner;
class sumNNaturalNo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum1,sum = 0;

        for(int i=1 ; i<=n ; i++){
            sum1 = sum;
            sum = sum+i;
            System.out.println(sum1+" + "+i+" = "+sum);
        }
        System.out.println("The overall sum is: "+sum);
    }
}