package Java_OOP.HW_2.impl;

import Java_OOP.HW_2.Animal;
import Java_OOP.HW_2.Flyable;
import Java_OOP.HW_2.Illable;
import Java_OOP.HW_2.Speakable;

public class Eagle extends Animal implements Flyable, Illable, Speakable {

    public Eagle(String name, String color, int legsCount) {
        super(name, color, legsCount);
    }

    public Eagle(String name) {
        this(name, null, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s : squawk!%n", getType());
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts");
    }

    @Override
    public void getIll() {
        System.out.println("Eagle is ill");
    }

    @Override
    public int getFlightSpeed() {
        return 10;
    }
}
