package SList;

/**
 *
 * @author Chin Jia Xiong
 */
public class SList<E> {
    
    private int size = 0;
    SNode<E> head;
    SNode<E> tail;
    
    public SList(){
        head = null;
        tail = null;
    }
    
    public void appendEnd(E e){
        if(tail == null){
            head = tail = new SNode<>(e);
        }
        else{
            tail.next = new SNode<>(e);
            tail = tail.next;
        }
        size ++;
    }
    
    public E removeInitial(){
        if(size == 0) return null;
        else{
            SNode<E> temp = head;
            head = head.next;
            size --;
            if(head == null) tail = null;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
        if(current.element.equals(e)) return true;
        for(int i=1; i<size; i++){
            current = current.next;
            if(current.element.equals(e)) return true;
        }
        return false;
    }
    
    public void display(){
        if(size == 0) System.out.println("None");
        else{
            SNode<E> current = head;
            System.out.print(head.element);
            if(size != 1) System.out.print(", ");
            for(int i=1; i<size; i++){
                current = current.next;
                System.out.print(current.element);
                if(i != size-1) System.out.print(", ");
            }
            System.out.println("");
        }
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        size = 0;
        head = null;
        tail = null;
    }
    
}
