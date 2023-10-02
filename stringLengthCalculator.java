//Write a Java recursive method to find the length of a given string.
import java.util.Scanner;
class stringLengthCalculator{
    public static int lengthCalculate(String str){
        if (str.isEmpty()){
            return 0;
        }
        else{
            return 1 + lengthCalculate(str.substring(1));
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("The length of the string is : "+lengthCalculate(str));
    }
}