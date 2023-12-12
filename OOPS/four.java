package OOPS;

public class four {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating an objects");
    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    //Main method
    public static void main(String[] args){
        myStaticMethod();

        four obj = new four();
        obj.myPublicMethod();
    }
}
