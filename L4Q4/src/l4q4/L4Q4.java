package l4q4;

/**
 *
 * @author Chin Jia Xiong
 */
public class L4Q4 {
    
    public static <E extends Comparable> String minmax(E[] arr){
        E mini = arr[0];
        E maxi = arr[0];
        for(E element: arr){
            if(element.compareTo(mini) < 0) mini = element;
            if(element.compareTo(maxi) > 0) maxi = element;
        }
        return "Min = " + mini + "  Max = " + maxi;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
