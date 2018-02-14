package t2q3;

/**
 *
 * @author Chin Jia Xiong
 */
public class T2Q3 {

    public static void main(String[] args) {
        System.out.println(reverse("String"));
    }
    
    public static String reverse(String txt){
        if(txt.length()==0)
            return "";
        else
            return Character.toLowerCase(txt.charAt(txt.length()-1)) + reverse(txt.substring(0, txt.length()-1)); // string becomes gnirts, g first then so on.
    }
    
}
