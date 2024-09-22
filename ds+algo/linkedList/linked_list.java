public class linked_list {

    Node head;
    int size;

    linked_list() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("empty list");
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        size--;

        // incase ll has only 1 element
        if (head.next == null) {
            head = null;
            return;
        }

        Node last = head.next;
        Node secondLast = head;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // print size
    public int getSize() {
        return size;
    }

    // reverse
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node recursiveReverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=recursiveReverse(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }

    public static void main(String[] args) {
        linked_list ll = new linked_list();
        ll.addFirst("a");
        ll.addFirst("b");
        ll.addLast("c");
        ll.printList();

        ll.reverse();
        ll.printList();

        ll.deleteFirst();
        ll.printList();

        System.out.println(ll.getSize());

    }
}