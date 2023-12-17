import java.util.Scanner;
// Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
class absolutePosNegNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if(num>0){
            if(num<1){
                System.out.println("Positive small number.");
            }else if(num>1000000){
                System.out.println("Positive large number.");
            }
            else{
                System.out.println("Positive number."); 
            }
        }
        else if(num<0){
            if(Math.abs(num)<1){
                System.out.println("Negative small number.");
            }
            else if(Math.abs(num)>1000000){
                System.out.println("Negative large number.");
            }
            else{
                System.out.println("Negative number.");
            }
        }
        else{
            System.out.println("Number is Zero.");
        }
    }
}