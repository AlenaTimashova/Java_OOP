package Java_OOP.HW_2.impl;

import Java_OOP.HW_2.Illable;
import Java_OOP.HW_2.Runable;
import Java_OOP.HW_2.Speakable;
import Java_OOP.HW_2.Swimable;

public class Human implements Illable, Runable, Swimable, Speakable {

    @Override
    public void getIll() {
        System.out.println("Human got ill");;
    }

    @Override
    public int getSwimSpeed() {
        return 30;
    }

    @Override
    public int getRunSpeed() {
        return 30;
    }

    @Override
    public void speak() {
        System.out.println("I can speak some language");;
    }
    
}
