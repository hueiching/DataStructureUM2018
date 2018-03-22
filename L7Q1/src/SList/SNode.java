package SList;

/**
 *
 * @author Chin Jia Xiong
 */
public class SNode<E> {
    E element;
    SNode<E> next;
    
    public SNode(){
        element = null;
        next = null;
    }
    
    public SNode(E e){
        element = e;
        next = null;
    }
}
