interface  FirstClass{
    public void myMethod();
}
interface SecondClass{
    public  void myOtherMethod();
}

class myClass implements FirstClass, SecondClass{
    public void myMethod(){
        System.out.println("Radhe Radhe");
    }
    public void myOtherMethod(){
        System.out.println("💖Kridha💛");
    };
}

public class multipleInheritance {
    public static void main(String[] args){
        myClass obj = new myClass();
        obj.myMethod();
        obj.myOtherMethod();
    }
}
