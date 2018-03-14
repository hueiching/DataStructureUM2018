package l5q1;

import java.util.ArrayList;

/**
 *
 * @author Chin Jia Xiong
 */
public class ArrayBagDemo {
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for(String item: content){
            aBag.add(item);
        }
    }
    
    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows: ");
        Object[] a = aBag.toArray();
        for(int i=0; i<aBag.getCurrentSize(); i++){
            System.out.print((String)a[i] + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        testAdd(bag1, contentsOfBag1);
        testAdd(bag2, contentsOfBag2);
        System.out.println("bag1: ");
        System.out.print("Adding ");
        for(String i: contentsOfBag1){
            System.out.print(i + " ");
        }
        System.out.println("");
        displayBag(bag1);
        System.out.println("bag2: ");
        System.out.print("Adding ");
        for(String i: contentsOfBag2){
            System.out.print(i + " ");
        }
        System.out.println("");
        displayBag(bag2);
        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.println("bag3, test the method union of bag1 and bag2:");
        displayBag(bag3); 
        BagInterface<String> bag4 = bag1.intersection(bag2);
        System.out.println("bag4, test the method intersection of bag1 and bag2:");
        displayBag(bag4); 
        BagInterface<String> bag5 = bag1.difference(bag2);
        System.out.println("bag5, test the method difference of bag1 and bag2:");
        displayBag(bag5); 
        // Tester for ArrayList
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("hi");
//        arr.add("all");
//        String[] b = (String[])arr.toArray();
//        System.out.println(b.getClass().getName());
    }
}
