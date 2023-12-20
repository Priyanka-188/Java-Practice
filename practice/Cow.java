class Animal{
    void eat(){
        System.out.println("Animals are served by Krishna.");
    }
}
public class Cow extends Animal {
    void eat(){
        System.out.println("Cows are herded by Gopal Himself..");
    }

    public static void main(String args[]){
        Animal cow = new Cow();  //here dynamic binding is happen //in the dynamic binding, the type of the object is determined at runtime.
        cow.eat();

        Dog dog = new Dog();
        dog.eat();
    }
}
