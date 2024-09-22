// hash set creates a list of all unique elements even if duplicate is added
// there is no fixed order of elements inside the hash set

import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
   public static void main(String args[]) {
       HashSet<Integer> set = new HashSet<>();
      
       //Add elements
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);


       //Size of hashSet
       System.out.println(set.size());


       //Search
       if(set.contains(1)) {
           System.out.println("present");
       }


       if(!set.contains(6)) {
           System.out.println("absent");
       }


       //Delete
       set.remove(1);
       if(!set.contains(1)) {
           System.out.println("absent");
       }


       //Print all elements
       System.out.println(set);


       //Iteration - HashSet does not have an order
       set.add(0);
       Iterator it = set.iterator();
        while (it.hasNext()) {
           System.out.print(it.next() + ", ");
       }
       System.out.println();


       //isEmpty
       if(!set.isEmpty()) {
           System.out.println("set is not empty");
       }
   }
}
