package l10q1;

import java.util.LinkedList;

/**
 *
 * @author Chin Jia Xiong
 */
public class MyQueue<E> {
    
    LinkedList<E> list;
    
    public MyQueue(E[] e){
        list = new LinkedList<>();
        for(E i: e){
            enqueue(i);
        }
    }
    
    public MyQueue(){
        list = new LinkedList<>();
    }
    
    public void enqueue(E e){
        list.add(e);
    }
    
    public E dequeue(){
        if(!list.isEmpty()){
            return list.removeFirst();
        }
        else return null;
    }
    
    public E getElement(int i){
        if(i>=0 && i<this.getSize()){
            return list.get(i);
        }
        return null;
    }
    
    public E peek(){
        return list.peek();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return this.getSize() == 0;
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
