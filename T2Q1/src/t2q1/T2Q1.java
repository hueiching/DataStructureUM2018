package t2q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class T2Q1 {

    public static void main(String[] args) {
        System.out.println(f(0));
    }
    
    public static int f(int n) {
        if (n == 1)
            return n;
        else
            return n * f(n-1);
    }
    
    // stack overflow exception occurs, there is no stopping condition to handle the value 0. The function will occupy the stack and cause the program to raise an error.
    
}
