package Java_OOP.HW_4.gb.list;

public class GBNode<T> {
    private T item;
    private GBNode<T> previousElement;
    private GBNode<T> nextElement;

    public GBNode(T item, GBNode<T> prevEl, GBNode<T> nextEl) {
        this.item = item;
        this.previousElement = prevEl;
        this.nextElement = nextEl;
    }

    public T getItem() {
        return item;
    }

    public GBNode<T> getPreviousElement() {
        return previousElement;
    }

    public GBNode<T> getNextElement() {
        return nextElement;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setPreviousElement(GBNode<T> previousElement) {
        this.previousElement = previousElement;
    }

    public void setNextElement(GBNode<T> nextElement) {
        this.nextElement = nextElement;
    }

}
