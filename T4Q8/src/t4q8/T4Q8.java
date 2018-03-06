package t4q8;

import java.util.ArrayList;

/**
 *
 * @author Chin Jia Xiong
 */
public class T4Q8 {

    public static void main(String[] args) {
        ArrayList<Integer>numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
    }
    
    public static <E extends ArrayList> void displayList(E list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
}
