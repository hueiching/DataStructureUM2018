package t4q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class Container <T> {
    private T t;
    
    public Container(){
        
    }
    
    public void add(T t){
        this.t = t;
    }
    
    public T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container<Integer> a = new Container<>();
        Container<String> b = new Container<>();
        a.add(50);
        b.add("Java");
        System.out.println(a.retrieve());
        System.out.println(b.retrieve());
    }
}
