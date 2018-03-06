package l4q6;

/**
 *
 * @author Chin Jia Xiong
 */
public class MinMaxTwoDArray {
    
    public static <E extends Comparable<E>> E min(E[][] list){
        E mini = list[0][0];
        for(E[] outside: list){
            for(E inside: outside){
                if(inside.compareTo(mini)<0) mini = inside;
            }
        }
        return mini;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E maxi = list[0][0];
        for(E[] outside: list){
            for(E inside: outside){
                if(inside.compareTo(maxi)>0) maxi = inside;
            }
        }
        return maxi;
    }
    
    public static void main(String[] args) {
        Integer[][] arr = {{4, 5, 6}, {1, 2, 3}};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
}
