package Java_OOP.HW_4.gb.list;

import java.util.Iterator;
import Java_OOP.HW_4.gb.GBDeque;

public class GBLinkedList<T> implements GBDeque<T> {

    private int size;
    {
        size = 0;
    }

    private GBNode<T> firstNode;
    private GBNode<T> lastNode;

     public GBLinkedList() {
        firstNode = null;
        lastNode = null;
    }

    @Override
    public void addFirst(T element) {
        GBNode<T> temp = firstNode;
        GBNode<T> newNode = new GBNode<>(element, null, temp);
        firstNode = newNode;
        if(temp == null) {
            lastNode = newNode;
        } else {
            temp.setPreviousElement(newNode);
        }
        size++;

    }

    @Override
    public void addLast(T element) {
        GBNode<T> temp = lastNode;
        GBNode<T> newNode = new GBNode<>(element, temp, null);
        lastNode = newNode;
        if(temp == null) {
            firstNode = newNode;
        } else {
            temp.setNextElement(newNode);
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementbyIndex(int index) {
        GBNode<T> result = firstNode;
        for (int i = 0; i < index; i++) {
            result = result.getNextElement();
        }
        return result.getItem();
    }

    @Override
    public Iterator<T> iterator() {
       return new Iterator<T>() {
        int counter = 0;
        @Override
        public boolean hasNext() {
            return counter < size;
        }

        @Override
        public T next() {
            return getElementbyIndex(counter++);
        }
       };
        
    }

}
