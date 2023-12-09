package OOPS;

public class three {
    
    int id, age;
    String name, address;
    
    public three(int age){
        this.age = age;
    }

    public three(int id, int age){
        this(age);
        this.id = id;
    }

    public three(int id, int age, String name, String address){
        this(id, age);
        this.name = name;
        this.address = address;
    }

    public static void main(String args[]){
        three employee = new three(191925, 22, "Priyanka","Haryana");

        System.out.println(employee.id +" and "+employee.name);
    }
}
