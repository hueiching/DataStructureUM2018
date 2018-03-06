package t4q5;

/**
 *
 * @author Chin Jia Xiong
 */
public class Duo <A, B>{
    A first;
    B second;
    
    public Duo(A a, B b){
        first = a;
        second = b;
    }
    
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("as", 1);
        Duo<Double, Double> points = new Duo<>(2.0, 1.0);
    }
}
