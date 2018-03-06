package l4q2;

/**
 *
 * @author Chin Jia Xiong
 */
public class MyGeneric<T> {
    private T e;
    
    public MyGeneric(){
        
    }
    
    public MyGeneric(T e){
        this.e = e;
    }
    
    public T getE(){
        return e;
    }
    
    public void setE(T e){
        this.e = e;
    }
    
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.setE("hi");
        intObj.setE(12);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
