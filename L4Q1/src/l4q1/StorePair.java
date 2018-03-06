package l4q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class StorePair implements Comparable<StorePair> {
    
    private int first, second;
    
    public StorePair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public int getFirst() {
        return first;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object o){
        StorePair tmp = (StorePair) o;
        if(this.first == tmp.first) return true;
        return false;
    }

    @Override
    public int compareTo(StorePair sp) {
        if(this.first > sp.first) return 1;
        else if(this.first == sp.first) return 0;
        return -1;
    }
}