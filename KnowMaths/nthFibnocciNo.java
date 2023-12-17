import java.util.Scanner;
// Write a Java recursive method to calculate the nth Fibonacci number.

class nthFibnocciNo{
    //making recursive function for calculating nth fibonacci number
public static int fib(int n){
    if(n==0){
        return 0;
    }
    else if(n==1){
        return 1;
    }

    // Recursive case: sum of the previous two Fibonacci numbers
    return fib(n-1)+fib(n-2);
    
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which fibonacci number you want to know: ");
        int num = sc.nextInt();

        System.out.println("The "+num+"th fibonacci number is: "+fib(num));

    }
}