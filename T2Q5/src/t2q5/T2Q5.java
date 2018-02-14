package t2q5;

/**
 *
 * @author Chin Jia Xiong
 */
public class T2Q5 {

    public static void main(String[] args) {
        System.out.println(printDigit(4567));
    }
    
    public static String printDigit(int digit){
        if(digit<=0)
            return "";
        else
            return printDigit(digit/10) + digit%10 + " ";
    }
    
}
