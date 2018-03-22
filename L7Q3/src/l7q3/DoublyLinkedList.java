package l7q3;

/**
 *
 * @author Chin Jia Xiong
 */
public class DoublyLinkedList<E> {
    
    int size;
    Node<E> head;
    Node<E> tail;
    
    public DoublyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public int size() { 
        return size; 
    }
     
    public boolean isEmpty() { 
        return size == 0; 
    }
     
    public void addFirst(E element) {
        System.out.println("adding: " + element);
        Node<E> tmp = new Node(element, head, null);
        if(head != null ) head.prev = tmp;
        head = tmp;
        if(tail == null) tail = tmp;
        size++;
    }
     
    
    public void addLast(E element) {
        System.out.println("adding: " + element);
        Node<E> tmp = new Node(element, null, tail);
        if(tail != null) tail.next = tmp;
        tail = tmp;
        if(head == null) head = tmp;
        size++;
    }
     
    
    public void iterateForward(){
        System.out.println("iterating forward..");
        Node<E> tmp = head;
        while(tmp != null){
            System.out.print(tmp.element);
            System.out.print(" ");
            tmp = tmp.next;
        }
    }
     
   
    public void iterateBackward(){
        System.out.println("iterating backward..");
        Node<E> tmp = tail;
        while(tmp != null){
            System.out.print(tmp.element);
            System.out.print(" ");
            tmp = tmp.prev;
        }
    }
     
    
    public E removeFirst() {
        if (size == 0) return null;
        Node<E> tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + tmp.element);
        return tmp.element;
    }
     
    
    public E removeLast() {
        if (size == 0) return null;
        Node<E> tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + tmp.element);
        return tmp.element;
    }
     
    public void add(int index, E element){
        if(index >= 0 && index <= size){
            if(index == 0)
		addFirst(element);
            else if(index == size)
		addLast(element);
            else{
                System.out.println("adding: " + element);
                Node<E> temp = head;
		for(int i=0; i<index; i++){
                    temp = temp.next;
                }
                Node<E> insert = new Node(element, temp, temp.prev);
		temp.prev.next = insert;
		temp.prev = insert;
		size ++;
            }
        }
    }
    
    public E remove(int index){
	E element = null;
	if(index < 0 || index >=size) return null;
	if(index == 0)
            removeFirst();
	else if(index == size-1)
            removeLast();
	else{
            Node<E> temp = head;
            for(int i=0; i<index; i++){
		temp = temp.next;
            }
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size --;
            System.out.println("deleted: " + temp.element);
        }
	return element;
    }
    
    public void clear(){
	Node<E> temp = head;
	while(head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
	}
	temp = null;
        tail.prev = tail.next = null;
        int tmp = size;
        size = 0;
        System.out.println("successfully clear " + tmp + " node(s)");
    }
    
}
