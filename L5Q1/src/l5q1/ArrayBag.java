package l5q1;

import java.lang.reflect.Array;
import java.util.HashSet;

/**
 *
 * @author Chin Jia Xiong
 */
public class ArrayBag<T> implements BagInterface<T> {
    
    private final int DEFAULT_CAPACITY = 25;
    T[] bag;
    int numberOfEntries=0;

    public ArrayBag() {
        bag = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries > DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if(this.isFull()) return false;
        bag[numberOfEntries++] = newEntry;
        return true;
    }
    
    @Override
    public T remove() {
        if(numberOfEntries > 0){
            return bag[--numberOfEntries];
        }
        return null;
    }

    @Override
    public T[] toArray() {
        T[] tmp = (T[])new Object[numberOfEntries];
        for(int i=0; i<numberOfEntries; i++){
            tmp[i] = bag[i];
        }
        return tmp;
    }

    @Override
    public boolean remove(T anEntry) {
        boolean found = false;
        for(int i=0; i<numberOfEntries; i++){
            if(bag[i].equals(anEntry)){
                found = true;
                for(int j=i; j<numberOfEntries-1; j++){
                    bag[j] = bag[j+1];
                }
                numberOfEntries--;
                break;
            }
        }
        if(found) return true;
        return false;
    }

    @Override
    public void clear() {
        bag = (T[])new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        for(int i=0; i<numberOfEntries; i++){
            if(bag[i].equals(anEntry)) counter ++;
        }
        return counter;
    }

    @Override
    public boolean contains(T anEntry) {
        for(T tmp: bag){
            if(tmp.equals(anEntry)) return true;
        }
        return false;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> bag) {
        ArrayBag<T> newBag = new ArrayBag<>();
        int newLength = numberOfEntries + bag.toArray().length;
        if(newLength > 25) newLength = 25;
        T[] tmp = bag.toArray();
        for(int i=0; i<numberOfEntries; i++){
            newBag.add(this.toArray()[i]);
        }
        int j=0;
        for(int i=numberOfEntries; i<newLength; i++){
            newBag.add(tmp[j]);
            j++;
        }
        return newBag;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> bag) {
        ArrayBag<T> newBag = new ArrayBag<>();
        HashSet<Integer> checkedIndex = new HashSet<>(); 
        T[] tmp = bag.toArray();
        for(int i=0; i<numberOfEntries; i++){
            for(int j=0; j<tmp.length; j++){
                if(this.toArray()[i].equals(tmp[j]) && !checkedIndex.contains(j)){
                    checkedIndex.add(j);
                    newBag.add(this.toArray()[i]);
                    break;
                }
            }
        }
        return newBag;
    }
    
    @Override
    public BagInterface<T> difference(BagInterface<T> bag) {
        ArrayBag<T> newBag = new ArrayBag<>();
        HashSet<Integer> checkedIndex = new HashSet<>(); 
        T[] tmp = bag.toArray();
        for(int i=0; i<numberOfEntries; i++){
            boolean found = false;
            for(int j=0; j<tmp.length; j++){
                if(this.toArray()[i].equals(tmp[j]) && !checkedIndex.contains(j)){
                    found = true;
                    checkedIndex.add(j);
                    break;
                }
            }
            if(!found) newBag.add(this.toArray()[i]);
        }
        return newBag;
    }
}
