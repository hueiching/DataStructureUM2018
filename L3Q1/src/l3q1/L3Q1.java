package l3q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class L3Q1 {

    public static void main(String[] args) {
        System.out.println(F(4, 10));
        System.out.println(F(12, 8));
        System.out.println(F(7, 12));
    }
    
    public static long F(int s, int t){
        return fact(s+t-1) / (fact(t-1) * fact(s));
    }
    
    public static long fact(int n){
        if(n == 1) return n;
        else{
            return n * fact(n-1);
        }
    }
    
}
