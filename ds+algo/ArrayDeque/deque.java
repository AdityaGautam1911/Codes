import java.util.ArrayDeque;
public class deque {
    public static void main(String[] args){
        ArrayDeque<Integer> deq=new ArrayDeque<>();
        //adding first and last
        deq.addFirst(1);
        deq.addLast(3);
        deq.addLast(5);
        System.out.println(deq);

        //removing first and last
        deq.removeFirst();
        deq.removeLast();
        System.out.println(deq);

        //size of deque
        System.out.println("current size "+deq.size());

    }
}

//conatins()
//getFirst(),getLast()
//isEmpty();