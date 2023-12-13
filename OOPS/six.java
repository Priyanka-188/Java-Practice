package OOPS;
import java.util.*;

public class six {
    public static void main(String args[]){
        //creating arraylist
        ArrayList <String> list = new ArrayList<String>();

        //Adding object in arraylist
        list.add("Radha Rani");
        list.add("KrishnaPriya");
        list.add("Vrindavaneswari");
        list.add("Yasashwini");
        list.add("Radhika");
        list.add("KrishnSayoda");

        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
