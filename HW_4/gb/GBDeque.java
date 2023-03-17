package Java_OOP.HW_4.gb;

public interface GBDeque<T> extends Iterable<T> {
    void addFirst(T type);
    void addLast(T type);
    int size();
    T getElementbyIndex(int index);
}
