//Write a Java recursive method to find the length of a given string.
import java.util.Scanner;
class stringLengthCalculator{
    public static int lengthCalculate(String str){
        // // Base case: if the string is empty, the length is 0
        if (str.isEmpty()){
            return 0;
        }
        // Recursive case: remove the first character of the
        // string and recursively call the method
        // with the remaining substring, and add 1 to the length
        return 1 + lengthCalculate(str.substring(1));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("The length of the string is : "+lengthCalculate(str));
    }
}