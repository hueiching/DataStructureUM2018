package l4q5;

/**
 *
 * @author Chin Jia Xiong
 */
public class FindMax {
    
    class Circle <T extends Comparable> implements Comparable<Circle <T>>{
        
        T radius;
        
        public Circle(T rad){
            radius = rad;
        }

        @Override
        public int compareTo(Circle<T> t) {
            return this.radius.compareTo(t.radius);
        }
        
        @Override
        public String toString(){
            return "" + radius;
        }
        
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E ans = list[0];
        for(E tmp: list){
            if(tmp.compareTo(ans) > 0) ans = tmp;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"red", "green", "blue"};
        Circle[] c = {new FindMax().new Circle(3.0), new FindMax().new Circle(2.9), new FindMax().new Circle(5.9)};
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));
    }
}
