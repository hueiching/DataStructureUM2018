package l10q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class L10Q1 {

    public static void main(String[] args) {
        String[] arr = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(arr);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println(fruitQ);
        System.out.println(fruitQ.peek());
        System.out.println(fruitQ.getSize());
        System.out.println(fruitQ.dequeue());
        System.out.println(fruitQ.getElement(2));
        System.out.println(fruitQ.contains("Cherry"));
        System.out.println(fruitQ.contains("Durian"));
        while(!fruitQ.isEmpty()) System.out.println(fruitQ.dequeue());
    }
    
}
