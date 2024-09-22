//queue using Java Collection Framework
import java.util.*;


public class queue_collection {
   public static void main(String args[]) {
       //Queue<Integer> q = new LinkedList();
       ArrayDeque<Integer> q = new ArrayDeque<>();
       q.add(11);
       q.add(2);
       q.add(30);
       q.add(4);
       q.add(5);


       while(!q.isEmpty()) {
           System.out.println(q.peek());
           q.remove();
       }
   }
}
