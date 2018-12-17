package Package;

public class MyLinkedList<E> {
    private Node head;
    int numNodes;

    public MyLinkedList() {
    }

    public class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }



    public void addFirst(E e) {
        Node current = head;
        head = new Node(e);
        head.next = current;
        numNodes++;


    }

    public void addLast(E e) {
        Node temp = head;
        Node last = new Node(e);
        for (int i = 0; i < numNodes &&temp.next!=null ; i++) {
            temp=temp.next;

        }
        temp.next= last;

    }

    public void add(int index,E e) {
        Node temp = head;
        Node current = new Node(e);
        Node holder;
        for (int i = 0; i < index-1 && temp.next!=null ; i++) {
            temp = temp.next;

        }
        holder = temp.next;
        temp.next = current;
        temp.next.next= holder;
        numNodes++;



    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }




}
