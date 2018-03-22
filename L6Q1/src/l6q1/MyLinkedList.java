package l6q1;

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
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail == null)
            tail = head;
    }
    
    public void addLast(E e){
        if(tail == null){
            head = tail = new Node<>(e);
        }
        else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size ++;
    }
    
    public void add(int index, E e){
        if(index == 0) addFirst(e);
        else if(index >= size) addLast(e);
        else{
            Node<E> current = head;
            for(int i=1; i<index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
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
    
    public E remove(int index){
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
    
    public void add(E e){
        addLast(e);
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
    
    public void print(){
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
    
    public void reverse(){
        if(size == 0) System.out.println("None");
        else if (size == 1) System.out.println(head.element);
        else{
            Object[] arr = new Object[size];
            Node<E> current = head;
            arr[0] = current.element;
            for(int i=1; i<size; i++){
                current = current.next;
                arr[i] = current.element;
            }
            for(int i=size-1; i>=0; i--){
                System.out.print(arr[i]);
                if(i != 0) System.out.print(", ");
            }
            System.out.println("");
        }
    }
    
    public int size(){
        return size;
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    public E get(int index){
        Node<E> current = head;
        if(index<0 || index>=size) return null;
        for(int i=0; i<index; i++){
            current = current.next;
        }
        return current.element;
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
    
    public int lastIndexOf(E e){
        if(size == 0) return -1;
        Node<E> current = head;
        int index = 0, result=-1;
        if(current.element.equals(e)) return index;
        for(int i=0; i<size-1; i++){
            current = current.next;
            index ++;
            if(current.element.equals(e)) result=index;
        }
        return result;
    }
    
    public void clear(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public E set(int index, E e){
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
    
    public E getMiddleValue(){
        if(size == 0) return null;
        int index = size / 2;
        return this.get(index);
    }
}
