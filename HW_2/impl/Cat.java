package Java_OOP.HW_2.impl;

import Java_OOP.HW_2.Animal;
import Java_OOP.HW_2.Illable;
import Java_OOP.HW_2.Runable;
import Java_OOP.HW_2.Speakable;

public class Cat extends Animal implements Illable, Runable, Speakable {
    
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.printf("%s : Meow!%n", getType());
    }

    private void wakeUp() {
        System.out.println(getType() + ": I woke up");
    }
 
    private void findFood() {
     System.out.printf("%s: found food%n", getType());
    }
 
    private void eat() {
        System.out.printf("%s: ate%n", getType());
    }
 
    public void toPlay() {
        System.out.printf("%s: played%n", getType());
    }
 
    private void goToSleep() {
        System.out.printf("%s: went to sleep%n", getType());
    }
 
     public void hunt() {
         wakeUp();
         findFood();
         eat();
         goToSleep();
     }

    @Override
    public void getIll() {
        System.out.printf("%s got ill", this.getName());
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

  
}
