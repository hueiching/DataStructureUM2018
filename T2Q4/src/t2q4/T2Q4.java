package t2q4;

/**
 *
 * @author Chin Jia Xiong
 */
public class T2Q4 {

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(10));
    }
    
    public static int sum(int n){
        if(n==1)
            return n;
        else
            return n + sum(n-1);
    }
}
