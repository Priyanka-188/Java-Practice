import java.util.Scanner;
// Find the number of days in a month
class noOfDays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num_of_daysInMonth=0;
        String nameOfMonth = "";

        System.out.println("Input a month number: ");
        int month = sc.nextInt();

        System.out.println("Input the year: ");
        int year = sc.nextInt();

        switch(month){
            case 1:
            nameOfMonth = "Janurary";
            num_of_daysInMonth = 31;
            break;

            case 2:
            nameOfMonth = "February";
            if((year%400==0) ||(year%4==0) && (year%100!=0)){
                num_of_daysInMonth = 29;
            }
            else{
                num_of_daysInMonth = 28;
            }
            break;

            case 3:
            nameOfMonth = "March";
            num_of_daysInMonth = 31;
            break;

            case 4:
            nameOfMonth = "April";
            num_of_daysInMonth = 30;
            break;

            case 5:
            nameOfMonth = "May";
            num_of_daysInMonth = 31;
            break;

            case 6:
            nameOfMonth = "June";
            num_of_daysInMonth = 30;
            break;

            case 7:
            nameOfMonth = "July";
            num_of_daysInMonth = 31;
            break;

            case 8:
            nameOfMonth = "August";
            num_of_daysInMonth = 31;
            break;

            case 9:
            nameOfMonth = "September";
            num_of_daysInMonth = 30;
            break;

            case 10:
            nameOfMonth = "October";
            num_of_daysInMonth = 31;
            break;

            case 11:
            nameOfMonth = "November";
            num_of_daysInMonth = 30;
            break;

            case 12:
            nameOfMonth = "December";
            num_of_daysInMonth = 31;
            break;
    }
    System.out.print(nameOfMonth + " " + year + " has " + num_of_daysInMonth + " days\n");
}
}
