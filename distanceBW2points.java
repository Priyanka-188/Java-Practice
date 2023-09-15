import java.util.Scanner;

class distanceBW2points{
    public static void main(Strings[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates of first point : ");
        double x1, y1 ;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.println("Enter coordinates of second point : ");
        double x2 , y2;
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();


        double distance = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The distance between the 2 points is "+distance);
        
    }
}