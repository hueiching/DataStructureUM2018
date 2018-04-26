package stackqueuepalin;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Chin Jia Xiong
 */
public class StackQueuePalin {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        String text = "abaaba";
        for(int i=0; i<text.length(); i++){
            stack.push(text.charAt(i));
            queue.add(text.charAt(i));
        }
        boolean palin = false;
        for(int i=0; i<text.length()/2; i++){
            palin = false;
            if(!Objects.equals(stack.pop(), queue.poll())){
                break;
            }
            palin = true;
        }
        System.out.println(palin);
    }
    
}
