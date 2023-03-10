package Java_OOP.HW_2.impl;

import Java_OOP.HW_2.Animal;
import Java_OOP.HW_2.Illable;
import Java_OOP.HW_2.Runable;
import Java_OOP.HW_2.Speakable;
import Java_OOP.HW_2.Swimable;

public class Dog extends Animal implements Illable, Runable, Swimable, Speakable {

    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        this(name, null);
    }


    @Override
    public void speak() {
        System.out.printf("%s : Woof!%n", getType());
    }

    @Override
    public void hunt() {
        System.out.println("Dog hunts");;
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }

    @Override
    public int getRunSpeed() {
        return 20;
    }

    @Override
    public void getIll() {
        System.out.println("Dog got ill");;
    }
}
