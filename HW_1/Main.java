package Java_OOP.HW_1;

import Java_OOP.HW_1.Eagle;
import Java_OOP.HW_1.Dog;
import Java_OOP.HW_1.Cat;
import Java_OOP.HW_1.Fish;
import Java_OOP.HW_1.Duck;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Martin", "white", 2);
        Cat cat = new Cat("Vaska", "black");
        Duck duck = new Duck("Donald", "white", 2);
        Dog dog = new Dog("Bobo", "white");
        Fish fish = new Fish("casper", "blue", 0);

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(duck);
        animals.add(eagle);
        animals.add(fish);

        animals.forEach(Animal :: speak);
        animals.forEach(Animal :: swim);
        animals.forEach(Animal :: toGo);
        animals.forEach(Animal :: fly);
        
    }
}
