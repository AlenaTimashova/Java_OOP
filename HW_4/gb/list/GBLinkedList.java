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
        firstNode = new GBNode<T>(null, null, lastNode);
        lastNode = new GBNode<T>(null, firstNode, null);
    }

    @Override
    public void addFirst(T element) {
        GBNode<T> next = firstNode;
        next.setItem(element);
        firstNode = new GBNode<T>(null, null, next);
        next.setPreviousElement(firstNode);
        size++;

    }

    @Override
    public void addLast(T element) {
        GBNode<T> prev = lastNode;
        prev.setItem(element);
        lastNode = new GBNode<T>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementbyIndex(int index) {
        GBNode<T> result = firstNode.getNextElement();
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
