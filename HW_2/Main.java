package Java_OOP.HW_2;

import Java_OOP.HW_2.impl.Dog;
import Java_OOP.HW_2.impl.Duck;
import Java_OOP.HW_2.impl.Eagle;
import Java_OOP.HW_2.impl.Fish;
import Java_OOP.HW_2.impl.Human;

import java.util.ArrayList;
import java.util.List;

import Java_OOP.HW_2.impl.Cat;
import Java_OOP.HW_2.impl.Doctor;

public class Main {

    public static void main(String[] args) {
        
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"));
        
        List<Illable> patients = new ArrayList<>();
        patients.add(new Cat("Рыжик"));
        patients.add(new Human());

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle("Петя"));
        flyables.add(new Duck("Серый"));

        for (Flyable f : flyables) {
            System.out.println(f.getFlightSpeed());
            
        }

        System.out.println(Animal.getAnimalsCount());

        List<Animal> myZoo = new ArrayList<>();
        myZoo.add(new Eagle("Петя"));
        myZoo.add(new Cat("Мурзик"));
        myZoo.add(new Duck("Дональд"));
        myZoo.add(new Dog("Бобик"));
        myZoo.add(new Fish("Патрик"));


        Doctor doctor = new Doctor();
        doctor.getIll();
        doctor.Cure(new Cat("Рыжик"));
        doctor.PrescribeMed(new Cat("Рыжик"));

        System.out.println(vetClinic.getFlyAnimals(myZoo));
        System.out.println(vetClinic.getSwimAnimals(myZoo));
        System.out.println(vetClinic.getSpeakingAnimals(myZoo));
        System.out.println(vetClinic.getRunAnimals(myZoo));
        vetClinic.PrintAnimals(myZoo);
    }

}
