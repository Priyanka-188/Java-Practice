import java.util.Scanner;
// Write a Java recursive method to calculate the factorial of a  positive integer entered by an user.
class factorial{
    public static int fact(int n){
        if(n<0){
            return -1;
        }
        else if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        int result =fact(n);
        if(result == -1){
            System.out.print("Number enterd is negative.Please Try again with a positive number. ");
        }
        else{
            System.out.println("The factorial of "+n+" is "+result);
        }
        

    }
}