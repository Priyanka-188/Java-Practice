package OOPS;

class Dog{

    String name = "Tommy";
}
public class DogDemo {
    public static void main(String args[]){
        Dog dog = null;
        try {
            System.out.println(dog.name);
        } catch (Exception e) {
            dog = new Dog();
            System.out.println(dog.name);
        }
        

    }
}
