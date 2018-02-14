package l2q3;

/**
 *
 * @author Chin Jia Xiong
 */
public class L2Q3 {

    public static void main(String[] args) {
        System.out.println(exponent(10, 3));
    }
    
    public static long exponent(int x, int m){
        if(m==0)
            return 1;
        else
            return x * exponent(x, m-1);  // assume y >= 0
    }
    
}
