package OOPS;

//abstract class
abstract class Main {
    public int age = 22;
    public String name = "Krishna";
    public abstract void study();
}

//subclass
class Student extends Main {
    int graduationYear = 2023;
    public void study(){
        System.out.println("Studied Java");
    }

}


public class five {
    public static void main(String[] args){
        Student st1 = new Student();
        System.out.println("Name: "+ st1.name);
        System.out.println("age: "+st1.age);
        System.out.println("graduation: "+st1.graduationYear);
        st1.study();
    }
}
