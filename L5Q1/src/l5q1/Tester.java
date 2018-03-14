package l5q1;

import java.util.Arrays;

/**
 *
 * @author Chin Jia Xiong
 */
public class Tester {
    public static void main(String[] args) {
        ArrayBag<Integer> bags =  new ArrayBag<>();
        bags.add(1);
        bags.add(2);
        bags.add(3);
        bags.add(3);
        ArrayBag<Integer> bags2 =  new ArrayBag<>();
        bags2.add(1);
        bags2.add(2);
        bags2.add(3);
        bags2.add(3);
        System.out.println(bags.contains(1));
        System.out.println(bags.getFrequencyOf(3));
        System.out.println(bags.remove());
        System.out.println(bags.remove(1));
        System.out.println(bags.isFull());
        System.out.println(bags.isEmpty());
        System.out.println(bags.getCurrentSize());
//        bags.clear();
        System.out.println("bags : " + Arrays.toString(bags.toArray()));
//        System.out.println("what the hell " + bags.toArray().getClass().getName());
        System.out.println("bags2: " + Arrays.toString(bags2.toArray()));
        BagInterface<Integer> everything = bags.union(bags2);
        System.out.println("new bag: " + Arrays.toString(everything.toArray()));
        BagInterface<Integer> commonItems = bags.intersection(bags2);
        System.out.println("bags : " + Arrays.toString(bags.toArray()));
        System.out.println("bags2: " + Arrays.toString(bags2.toArray()));
        System.out.println("new intersection bag: " + Arrays.toString(commonItems.toArray()));
        BagInterface<Integer> leftOver1 = bags.difference(bags2);
        System.out.println("1 leftover 2: " + Arrays.toString(leftOver1.toArray()));
        BagInterface<Integer> leftOver2 = bags2.difference(bags);
        System.out.println("2 leftover 1: " + Arrays.toString(leftOver2.toArray()));
        
    }
    
}
