package Java_OOP.HW_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Java_OOP.HW_3.drugs.Component;
import Java_OOP.HW_3.drugs.impl.CatDrug;
import Java_OOP.HW_3.drugs.impl.components.Azitron;
import Java_OOP.HW_3.drugs.impl.components.Penizilin;
import Java_OOP.HW_3.drugs.impl.components.Water;

public class Main {
    public static void main(String[] args) {
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrug drug = new CatDrug(componentsCat);
        for (Component component : drug) {
            System.out.println(component);
        }
        List<Component> componentCat2 = List.of(new Azitron("Азитрон","4",4),
                new Penizilin ("Пинецилин", "18", 6));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 1),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 1),
                new Azitron("Азитрон", "10", 3));
        CatDrug drug1 = new CatDrug(componentCat2);
        CatDrug drug2 = new CatDrug(componentCat3);
        CatDrug drug4 = new CatDrug(componentCat4);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);

        
        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);

        List<Component> components = List.of(
                new Azitron("Азитрон", "2", 4),
                new Water("Вода", "100", 1), 
                new Penizilin("Пеницилин", "10", 10),
                new Water("Вода", "100", 1),
                new Azitron("Азитрон", "20", 6));

        System.out.println(components);
        Set<Component> result = new HashSet<>(components); 
        System.out.println(result);
    }
}