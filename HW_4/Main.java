package Java_OOP.HW_4;

import Java_OOP.HW_4.gb.GBDeque;
import Java_OOP.HW_4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBDeque<String> check = new GBLinkedList<String>();
        check.addFirst("12");
        check.addFirst("13");
        check.addLast("16");
        check.addFirst("14");
        check.addFirst("15");
        
        System.out.println(check.getElementbyIndex(0));
        System.out.println(check.getElementbyIndex(1));
        System.out.println(check.getElementbyIndex(2));
        System.out.println(check.getElementbyIndex(3));
        System.out.println(check.getElementbyIndex(4));
        System.out.println(check.size());   
    }
}
