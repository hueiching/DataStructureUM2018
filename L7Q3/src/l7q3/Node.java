package l7q3;

/**
 *
 * @author Chin Jia Xiong
 */
public class Node<E> {
    Node<E> next;
    Node<E> prev;
    E element;
    
    Node(E e, Node<E> n, Node<E> p){
        element = e;
        next = n;
        prev = p;
    }
    
    Node(E e){
        element = e;
    }
}
