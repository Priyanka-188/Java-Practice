public class Test   
{  
    public static void main (String args[])  
    {  
        String s1 = "Sharma is a good player";  
        String s2 = new String("Sharma is a good player");  
        s2 = s1.intern();  
        System.out.println(s1 ==s2);  
    }  
}  