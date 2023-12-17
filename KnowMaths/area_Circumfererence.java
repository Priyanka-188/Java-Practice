// Write a Java program to print the area and perimeter of a circle.
import java.util.Scanner;
public class area_Circumfererence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle ");
        int radius = sc.nextInt();

        double area = (3.14 * radius * radius);
        double circumference = (2 * 3.14 * radius);

        System.out.println("The area of circle is "+area +" square unit");
        System.out.println("The circumference of the circle is "+circumference + " units");

    }
}
