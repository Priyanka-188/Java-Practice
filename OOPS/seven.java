package OOPS;

import java.util.*;

public class seven {
    public static void main(String[] args) {
        PriorityQueue<String> Pq = new PriorityQueue<>();

        Pq.add("Radhika");
        Pq.add("Krishna");
        Pq.add("Priyanka");
        Pq.add("Mohan");
        Pq.add("Kisori");
        Pq.add("Priya");

        System.out.println("head " + Pq.element());
        System.out.println(Pq.peek());
        System.out.println("Iterating the queue elements: ");

        // Iterator itr = Pq.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

       System.out.println( Pq.remove());
        Pq.poll();
        System.out.println("after removing two elements:");
        // Iterator<String> itr2 = Pq.iterator();
        // while (itr2.hasNext()) {
        //     System.out.println(itr2.next());
        // }

    }
}
