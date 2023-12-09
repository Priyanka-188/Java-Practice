package OOPS;

public class one {
    one(int a, int b){
        System.out.println(" all integer a = "+a+" b = "+b);
    }
    
    one(int a, float b){
        System.out.println(" all float a = "+a+" b = "+b);
    }
    

    public static void main(String args[]){
        one obj1 = new one(3,4);
        one obj2 = new one(2,12.45f);

    }
}
