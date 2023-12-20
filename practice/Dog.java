public class Dog {

    //static binding
    protected void eat(){
        System.out.println("Dog is eating..");
    }
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.eat();
    }
}
