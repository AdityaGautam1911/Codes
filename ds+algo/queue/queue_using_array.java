//queue using array
public class queue_using_array {
   static class Queue {
       static int arr[];
       static int size;
       static int rear;


       Queue(int size) {
           this.size = size;
           arr = new int[size];
           rear = -1;
       }


       public static boolean isEmpty() {
           return rear == -1;
       }


       public static boolean isFull() {
           return rear == size-1;
       }


       public static void add(int data) {
           if(isFull()) {
               System.out.println("Overflow");
               return;
           }


           arr[++rear] = data;
       }


       //O(n)
       public static int remove() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
           int front = arr[0];
           for(int i=0; i<rear; i++) {
               arr[i] = arr[i+1];
           }

           return front;
       }


       public static int peek() {
           if(isEmpty()) {
               System.out.println("empty queue");
               return -1;
           }
          
           return arr[0];
       }
   }
   public static void main(String args[]) {
       Queue q = new Queue(10);
       q.add(11);
       q.add(75);
       q.add(100);
       System.out.println("removed->"+q.remove());
       System.out.println("peek->"+q.peek());
       q.add(20);
       q.add(3);
       System.out.println("removed->"+q.remove());
       System.out.println("peek->"+q.peek());
   }
}
