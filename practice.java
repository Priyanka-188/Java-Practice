import java.util.*;
class practice{
 public static void main(String[] args){
    
    PriorityQueue<String> subjects = new PriorityQueue<String>();
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Maths");
        subjects.add("History");
        subjects.add("Polity");
        System.out.println("Original Priority queue: " + subjects);
   

   // Inserts the specified element into this priority queue.
   subjects.offer("Economics");
 
   System.out.println("The New Priority Queue: " + subjects);
 }


}