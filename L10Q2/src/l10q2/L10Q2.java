package l10q2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Chin Jia Xiong
 */
public class L10Q2 {

    public static void main(String[] args) {
        System.out.println(isPalin("aba"));
    }
    
    public static boolean isPalin(String text){
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for(int i=0; i<text.length(); i++){
            stack.push(text.charAt(i));
            queue.add(text.charAt(i));
        }
        for(int i=0; i<text.length()/2; i++){
            if(!Objects.equals(stack.pop(), queue.poll())){
                return false;
            }
        }
        return true;
    }
    
}
