package Java_OOP.HW_2;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {

    private final List<Animal> animals;

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public VetClinic() { this.animals = new ArrayList<>(); }
    
    public List<Animal> getFlyAnimals(List<Animal> animals) {
        List<Animal> flyAnimals = new ArrayList<>();
        for (Animal a : animals) {
            if(a instanceof Flyable) {
                flyAnimals.add(a);
            }
        }

        return flyAnimals;
    }

    public List<Animal> getRunAnimals(List<Animal> animals) {
        List<Animal> runAnimals = new ArrayList<>();
        for (Animal a : animals) {
            if(a instanceof Runable) {
                runAnimals.add(a);
            }
        }

        return runAnimals;
    }

    public List<Animal> getSwimAnimals(List<Animal> animals) {
        List<Animal> swimAnimals = new ArrayList<>();
        for (Animal a : animals) {
            if(a instanceof Swimable) {
                swimAnimals.add(a);
            }
        }

        return swimAnimals;
    }

    public List<Animal> getSpeakingAnimals(List<Animal> animals) {
        List<Animal> speakingAnimals = new ArrayList<>();
        for (Animal a : animals) {
            if(a instanceof Speakable) {
                speakingAnimals.add(a);
            }
        }

        return speakingAnimals;
    }

    public void PrintAnimals(List<Animal> animals) {
        
        for (Animal a : animals) { System.out.print(a + " "); }
        
    }
    
}
