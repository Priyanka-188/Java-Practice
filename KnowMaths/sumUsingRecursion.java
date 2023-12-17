import java.util.Scanner;
// 2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.
class sumUsingRecursion{

    public static int sum(int n ){
        //if user enter a negative value;
        if(n<0){
            return -1;
        }
        //base condition
        else if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num= sc.nextInt();
        
        int result = sum(num);
        if(result==-1){
            System.out.println("You entered a negative number. Try again with a poitive numver.");
        }
        else{
            System.out.println("The sum of "+num+" numbers from 1 to "+num+" is "+result);
        }
    }
}