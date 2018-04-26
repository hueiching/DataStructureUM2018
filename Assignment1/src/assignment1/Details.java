package assignment1;

/**
 *
 * @author Chin Jia Xiong
 */
public class Details implements Comparable<Details> {
    int time;
    String details;
    
    public Details(int t, String d){
        time = t;
        details = d;
    }

    @Override
    public int compareTo(Details t) {
        if(time > t.time) return 1;
        if(time == t.time) return 0;
        return -1;
    }
    
}
