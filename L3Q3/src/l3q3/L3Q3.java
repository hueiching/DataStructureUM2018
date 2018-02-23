package l3q3;

import java.util.LinkedList;
import java.util.Scanner;

public class L3Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of discs : ");
        int num = input.nextInt();
        LinkedList<Integer> a = new LinkedList();
        for(int i=num; i>0; i--) a.add(i);
        LinkedList<Integer> b = new LinkedList();
        LinkedList<Integer> c = new LinkedList();
        System.out.println("Step 0          :a" + a + " , b[] , c[]");
        System.out.println("Number of steps : " + printSteps(a, b, c));
    }
    
    public static long printSteps(LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c){
        return printSteps(a, b, c, a.size(), 0);
    }
    
    public static long printSteps(LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c, int total, long counter){
        if(a.isEmpty() && b.isEmpty()) return counter;
        else{
            if(total % 2 == 0){
                if(!a.isEmpty() || !b.isEmpty()){
                    move(a, b);
                    counter ++;
                    System.out.println("Step " + counter + "          :a" + a + " , b" + b + " , c" + c);
                }
                if(!a.isEmpty() || !b.isEmpty()){
                    move(a, c);
                    counter ++;
                    System.out.println("Step " + counter + "          :a" + a + " , b" + b + " , c" + c);
                }
                if(!a.isEmpty() || !b.isEmpty()){
                    move(b, c);
                    counter ++;
                    System.out.println("Step " + counter + "          :a" + a + " , b" + b + " , c" + c);
                }
            }
            else{
                if(!a.isEmpty() || !b.isEmpty()){
                    move(a, c);
                    counter ++;
                    System.out.println("Step " + counter + "          :a" + a + " , b" + b + " , c" + c);
                }
                if(!a.isEmpty() || !b.isEmpty()){
                    move(a, b);
                    counter ++;
                    System.out.println("Step " + counter + "          :a" + a + " , b" + b + " , c" + c);
                }
                if(!a.isEmpty() || !b.isEmpty()){
                    move(b, c);
                    counter ++;
                    System.out.println("Step " + counter + "          :a" + a + " , b" + b + " , c" + c);
                }
            }
            return printSteps(a, b, c, total, counter);
        }
    }
    
    public static void move(LinkedList<Integer> a, LinkedList<Integer> b){
        if(a.isEmpty()){
            a.add(b.removeLast());
        }
        else if(b.isEmpty()){
            b.add(a.removeLast());
        }
        else if(b.peekLast() < a.peekLast()) a.add(b.removeLast());
        else if(a.peekLast() < b.peekLast()) b.add(a.removeLast());
    }
    
    public static double fastCompute(int num){
        return Math.pow(2, num) - 1;
    }
    
}
