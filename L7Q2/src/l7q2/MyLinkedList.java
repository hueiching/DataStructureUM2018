package l7q2;

/**
 *
 * @author Chin Jia Xiong
 */
public class MyLinkedList<E> {
    
    private int size = 0;
    Node<E> head;
    Node<E> tail;
    
    public MyLinkedList(){
        head = null;
        tail = null;
    }
    
    public void add(E e){
        if(tail == null){
            head = tail = new Node<>(e);
        }
        else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size ++;
    }
    
    public E removeFirst(){
        if(size == 0) return null;
        else{
            Node<E> temp = head;
            head = head.next;
            size --;
            if(head == null) tail = null;
            return temp.element;
        }
    }
    
    public E removeLast(){
        if(size == 0) return null;
        else if(size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else{
            Node<E> current = head;
            for(int i=0; i<size-2; i++) current = current.next;
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E removeElement(E item){
        int index = this.indexOf(item);
        if(index < 0 || index >= size) return null;
        else if(index == 0) return removeFirst();
        else if(index == size-1) return removeLast();
        else{
            Node<E> previous = head;
            for(int i=1; i<index; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    public boolean contains(E e){
        Node<E> current = head;
        if(current.element.equals(e)) return true;
        for(int i=1; i<size; i++){
            current = current.next;
            if(current.element.equals(e)) return true;
        }
        return false;
    }
    
    public void printList(){
        if(size == 0) System.out.println("None");
        else{
            Node<E> current = head;
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
    
    public int getSize(){
        return size;
    }
    
    public int indexOf(E e){
        if(size == 0) return -1;
        Node<E> current = head;
        int index = 0;
        if(current.element.equals(e)) return index;
        for(int i=0; i<size-1; i++){
            current = current.next;
            index ++;
            if(current.element.equals(e)) return index;
        }
        return -1;
    }
    
    public E replace(E item, E e){
        int index = this.indexOf(item);
        if(index<0 || index>=size){
            return null;
        }
        if(index == 0){
            E tmp = head.element;
            head.element = e;
            return tmp;
        }
        if(index == size-1){
            E tmp = tail.element;
            tail.element = e;
            return tmp;
        }
        else{
            Node<E> current = head;
            for(int i=0; i<index; i++){
                current = current.next;
            }
            E tmp = tail.element;
            current.element = e;
            return tmp;
        }
    }
}
