package OOPS;

public class two {
    int rollno;
    String name;
    static String collegeName = "Central University of Haryana";

    two(int roll, String naam){
        this.rollno = roll;
        this.name = naam;
    }

    void display(){
        System.out.println("rollno : "+rollno+" name :"+name+" college "+collegeName);
    }

    public static void main(String args[]){

        two obj1 = new two(191925,"Priyanka");
        obj1.display();

    }



}
