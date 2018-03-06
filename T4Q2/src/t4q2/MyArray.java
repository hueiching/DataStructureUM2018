package t4q2;

/**
 *
 * @author Chin Jia Xiong
 */
public class MyArray{
    
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        String[] b = {"Jane", "Tom", "Bob"};
        Character[] c = {'a', 'b', 'c'};
        listAll(a);
        listAll(b);
        listAll(c);
    }
    
    public static <T> void listAll(T[] a){
        for(T b: a){
            System.out.print(b + "   ");
        }
        System.out.println("");
    }
}
