package Java_OOP.HW_2.impl;

import Java_OOP.HW_2.Animal;
import Java_OOP.HW_2.Flyable;
import Java_OOP.HW_2.Illable;
import Java_OOP.HW_2.Speakable;
import Java_OOP.HW_2.Swimable;

public class Duck extends Animal implements Flyable, Illable, Swimable, Speakable {
    public Duck(String name, String color, int legsCount) {
        super(name, color, legsCount);
    }

    public Duck(String name) {
        this(name, null, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s : Quack!%n", getType());
    }

    @Override
    public void hunt() {
        System.out.println("Duck eats grass");;
    }

    @Override
    public int getFlightSpeed() {
        return 3;
    }

    @Override
    public void getIll() {
        System.out.println("Duck is ill");
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

}
