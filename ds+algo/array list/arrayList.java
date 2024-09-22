import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // adding elements
        list.add(0);
        list.add(5);
        list.add(7);

        

        //get elements
        int element=list.get(1);
        System.out.println(element);

        //add element in between
        list.add(1,4);


        //change element at index
        list.set(1,100);


        //delete element
        list.remove(3);

        //length
        int length=list.size();
        System.out.println("length of array list is "+length);


        //loop
        System.out.print("printed using for loop-->");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        //sort the array
        Collections.sort(list);


        //printing array
        System.out.println(list);
    }
}
