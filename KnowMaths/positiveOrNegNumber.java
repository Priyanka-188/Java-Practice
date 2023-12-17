import java.util.Scanner;
// Write a Java program to get a number from the user and print whether it is positive or negative.
class positiveOrNegNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        System.out.println(posNegCheck(num));
    }

    public static  String posNegCheck(int num){
        if(num>0){
            return "Number is positive.";
        }
        else if(num==0){
            return "Number is Zero. ";
        }else{
            return "Number is negative.";
        }
    }
}