package Java_OOP.HW_1;



public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.printf("%s : Meow!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

  

    private void wakeUp() {
        System.out.println(getType() + ": woke up");
    }

    private void findFood() {
        String out = String.format("%s: found food%n", getType());
        System.out.println(out);
    }

    private void eat() {
        System.out.printf("%s: ate%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: went to sleep%n", getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s : I can't swim!%n", getType());
    }
    @Override
    public void fly() {
        System.out.printf("%s : I can't fly%n", getType());
    }
}
