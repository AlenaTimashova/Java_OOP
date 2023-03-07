package Java_OOP.HW_1;

public class Eagle extends Animal {

    public Eagle(String name, String color, int legsCount) {
        super(name, color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s : squawk!%n", getType());
    }

    @Override
    public void toGo() {
        System.out.printf("%s : I can't walk, but I can fly!%n", getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s : I can't swim!%n", getType());
    }
}
