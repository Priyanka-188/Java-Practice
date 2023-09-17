import java.util.Scanner;
// Write a Java program that takes three numbers from the user and prints the greatest number.
class greatestOfNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers among which you want to find the greatest one: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("The greatest among 3 numbers is: "+ greatestOf3(num1,num2,num3));
    }
    public static int greatestOf3(int num1, int num2, int num3){
        if (num1>num2){
            if(num1>num3){
                return num1;
            }
            else{
                return num3;
            }
        }
        else {
            if(num2>num3){
                return num2;
            }
            else{
                return num3;
            }
        }
    }
}