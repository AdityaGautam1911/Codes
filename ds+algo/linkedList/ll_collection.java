import java.util.LinkedList;

public class ll_collection {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        //adding elements
        ll.addFirst("linked list");
        ll.addFirst("this is a");
        System.out.println(ll);

        ll.addLast("added at last");
        System.out.println(ll);

        System.out.println(ll.size());

        //looping in linked list
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+"->");
        }
        System.out.println("NULL");

        //removing from linked list
        ll.removeFirst();
        ll.remove(1);

        System.out.println(ll);
    }
}
