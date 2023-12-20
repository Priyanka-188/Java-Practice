abstract class Bike{
    abstract void run();
}

public class Honda4 extends Bike{
    void run(){
        System.out.println("Bike is running by Krishna");
    }
    public static void main(String args[]){
        Bike bike = new Honda4();
        bike.run();
    }
}