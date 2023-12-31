public class Main1 {
    public static void main(String str[]){
        try{
            int a = 10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Aritmatic exception occured!");
        }
        finally{
            System.out.println("This finally block will execute reagardless of the fact that error occured or not.");
        }
    }
}
