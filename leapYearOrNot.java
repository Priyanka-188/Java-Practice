//  Write a Java program that takes a year from the user and prints whether it is a leap year or not.
import java.util.Scanner;
class leapYearOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

        if((year % 400 == 0) || (year % 4 == 0) &&(year %100!=0)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year +" is not a leap year.");
        }

    }
}