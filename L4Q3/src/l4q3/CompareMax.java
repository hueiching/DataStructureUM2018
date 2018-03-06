package l4q3;

/**
 *
 * @author Chin Jia Xiong
 */
public class CompareMax {
    
    public static <E extends Comparable> E maximum(E a, E b, E c){
        E ans = a;
        if(b.compareTo(ans) >= 1) ans = b;
        if(c.compareTo(ans) >= 1) ans = c;
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(maximum(1, 2, 3));
    }
}
