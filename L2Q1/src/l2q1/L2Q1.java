package l2q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class L2Q1 {

    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }
    
    public static String substituteAI(String txt){
        if(txt.length()==0)
            return "";
        else{
            char result = txt.charAt(0);
            if(result=='a')
                result = 'i';
            return result + substituteAI(txt.substring(1, txt.length()));
        }
    }
    
}
