import java.util.Scanner;

public class swap2varibles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.next();
        String surname = sc.next();
       
        System.out.println("Full name before Swapping "+(name+" "+surname));

        // swapping the 2 string variables
        String temp = name;
        name = surname;
        surname = temp;
        System.out.println("Full name before Swapping "+(name+" "+surname));

    }
}
