package Package;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("--_TEst_--");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.add(2, 10);
        myLinkedList.printList();


    }
}
