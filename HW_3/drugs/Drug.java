package Java_OOP.HW_3.drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug>{
    @Override
    public int compareTo(Drug o) {
        int result = Integer.compare(getDrugPower(), o.getDrugPower());

        if (result == 0) {
            int compare = 0;
            for (Component component : o) {
                for (Component thisComponent : this.components) {
                    compare += thisComponent.getName().compareTo(component.getName());
                }
            }
            if (compare > 0) {
                result = 1;
            }
            else if (compare < 0) {
                result = -1;
            }
            else result = 0;
        }

        return result;
    }

   
    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }
            public Component next() {
                return components.get(index++);
            }
        };
    }
    private List<Component> components;
    int index;

    public Drug(List<Component> component) {
        this.components = component;
        this.index = 0;
    }

    public int getDrugPower(){
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }
}
