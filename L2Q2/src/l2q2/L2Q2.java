package l2q2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Chin Jia Xiong
 */
public class L2Q2 {

    public static void main(String[] args) {
        permuteString("abbc");
    }
    
    public static void permuteString(String txt){
        Set<String> set = new HashSet();
        permuteString("", txt, set);
        for(String s: set) System.out.println(s);
    }
    
    public static void permuteString(String start, String end, Set set){
        if(end.length() == 2){
            set.add(start + end);
            String rev = swap(end);
            set.add(start + rev);
        }
        else{
            for(int i=0; i<end.length(); i++){
                String tmp = end.substring(0, i) + end.substring(i+1);
                permuteString(start + Character.toString(end.charAt(i)), tmp, set);
            }
        }
    }
    
    public static String swap(String txt){
        char[] rslt = new char[]{txt.charAt(1), txt.charAt(0)};
        return new String(rslt);
    }
}