package t1q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class Main {
    public static void main(String[] args) {
        Telephone[] tel = {new Telephone("03", "79676300"), 
                           new Telephone("03", "79676301"), 
                           new Telephone("03", "79676302"), 
                           new Telephone("03", "79676303"), 
                           new Telephone("03", "79676304")};
        for(int i=0; i<tel.length; i++){
                System.out.println(tel[i].makeFullNumber());
        }
    }
}
