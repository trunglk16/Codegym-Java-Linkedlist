package Package;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("--_TEst_--");
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(11);
        ll.addLast(12);
        ll.addLast(13);
        ll.add(2, 10);
        ll.printList();


    }
}
