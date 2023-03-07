package Java_OOP.HW_1;


public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.printf("%s : Woof!%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s : I can't fly%n", getType());
    }
}
