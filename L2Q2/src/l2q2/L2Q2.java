package l2q2;

/**
 *
 * @author Chin Jia Xiong
 */
public class L2Q2 {

    public static void main(String[] args) {
        permuteString("String");
    }
    
    public static void permuteString(String txt){
        permuteString("", txt);
    }
    
    public static void permuteString(String start, String end){
        if(end.length() == 2){
            System.out.println(start + end);
            String rev = swap(end);
            System.out.println(start + rev);
        }
        else{
            for(int i=0; i<end.length(); i++){
                String tmp = end.substring(0, i) + end.substring(i+1);
                permuteString(start + Character.toString(end.charAt(i)), tmp);
            }
        }
    }
    
    public static String swap(String txt){
        char[] rslt = new char[]{txt.charAt(1), txt.charAt(0)};
        return new String(rslt);
    }
}