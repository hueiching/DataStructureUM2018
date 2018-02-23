package t2q5;

/**
 *
 * @author Chin Jia Xiong
 */
public class T2Q5 {

    public static void main(String[] args) {
        printDigit(4567);
    }
    
    public static void printDigit(int digit){
        if(digit<10)
            System.out.print(digit + " ");
        else{
            printDigit(digit / 10);
            System.out.print(digit % 10 + " ");
        }
    }
    
}
