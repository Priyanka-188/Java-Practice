package OOPS;

public class Animal {
    int eyes ;

    protected String animalName = "Mouse";
    public static void main(String args[]){
        Animal animalObj = new Animal();
        animalObj.eyes =2;

        // int a =2;
        // changePrimitives(a);
        changeRef(animalObj);
        System.out.println(animalObj.eyes);
    }

    public static void changePrimitives(int a){
        a=5;
    }
    public static void changeRef(Animal animalObj){
        animalObj.eyes = 12;
    }
}
