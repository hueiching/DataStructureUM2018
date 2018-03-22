package l6q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class Tester {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.print();
        list.reverse();
        System.out.println(list.size());
        System.out.println(list.getFirst() + " and " + list.getLast());
//        System.out.println(list.remove(list.size() / 2));
        System.out.println("second value is " + list.get(1));
        System.out.println("third value is " + list.get(2));
        System.out.println("position of c is " + list.indexOf("c"));
        list.set(0, "h");
        list.set(1, "e");
        list.set(2, "l");
        list.set(3, "l");
        list.set(4, "o");
        list.print();
        System.out.println(list.lastIndexOf("l"));
        System.out.println(list.getMiddleValue());
    }
}
