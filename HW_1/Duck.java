package Java_OOP.HW_1;

public class Duck extends Animal {
    public Duck(String name, String color, int legsCount) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s : Quack!%n", getType());
    }

}
