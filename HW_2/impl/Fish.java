package Java_OOP.HW_2.impl;

import Java_OOP.HW_2.Animal;
import Java_OOP.HW_2.Illable;
import Java_OOP.HW_2.Swimable;

public class Fish extends Animal implements Illable, Swimable {
    
    public Fish(String name, String color, int Legscount){
        super(name, color, Legscount);
    }

    public Fish(String name) {
        this(name, null, 0);
    }
    
    @Override
    public void hunt() {
        System.out.println("Fish finds food");
    }

    @Override
    public int getSwimSpeed() {
        return 25;
    }

    @Override
    public void getIll() {
        System.out.println("Fish got ill");
    }

   
}
