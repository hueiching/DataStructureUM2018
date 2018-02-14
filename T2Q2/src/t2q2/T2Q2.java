package t2q2;

/**
 *
 * @author Chin Jia Xiong
 */
public class T2Q2 {

    public static void main(String[] args) {
        System.out.println(f(2));
    }
    
    public static int f(int n) {
        if (n == 0)
            return n;
        else{
            System.out.println(n);  // to test the behavior of n.
            return f(n+1) + n;
        }
    }
    
    // example: f(2)
    // return f(3) + 2
    // return f(4) + 3 + 2
    // return f(5) + 4 + 3 + 2
    // ... until stack is occupied and threw StackOverflowError.
    // the stopping condition can never be met.
}
