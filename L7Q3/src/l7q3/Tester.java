package l7q3;

/**
 *
 * @author Chin Jia Xiong
 */
public class Tester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> ls = new DoublyLinkedList<>();
        ls.addFirst(1);
        ls.addLast(10);
        ls.addLast(100);
        ls.add(2, 2);
        ls.remove(3);
        ls.iterateForward();
        System.out.println("");
        ls.iterateBackward();
        System.out.println("");
        System.out.println("size of current Doubly Linked List: " + ls.size());
        ls.clear();
        System.out.println("");
        System.out.println("size of current Doubly Linked List: " + ls.size());
    }
}
