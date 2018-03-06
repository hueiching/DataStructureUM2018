package l4q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class StorePairGeneric<T extends Comparable> implements Comparable<StorePairGeneric<T>> {
    
    private T first, second;
    
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object o){
        StorePairGeneric<T> tmp = (StorePairGeneric) o;
        if(this.first == tmp.first) return true;
        return false;
    }

    @Override
    public int compareTo(StorePairGeneric<T> t) {
        return this.first.compareTo(t.first);
    }
    
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(a));
    }
}
