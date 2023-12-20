//Read only class
/*
public class Student{
    private String name = "Kanha";

    public String getName(){
        return name;
    }

    public static void main(String args[]){
        Student s1  = new Student();
        System.out.println(s1.getName());
    }
}

*/


//Write only class

public class Student {
    private String name = "Radha Radha";

    public void setName(String name){
        this.name = name;
        System.out.println(name);
    }

    public static void main(String args[]){
        Student s1 = new Student();
        s1.setName("Radha Madhav");
    }
}