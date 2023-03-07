package Java_OOP.HW_1;

public class Fish extends Animal{
    
    public Fish(String name, String color, int Legscount){
        super(name, color, Legscount);
    }
    
    @Override
    public void speak() {
        System.out.printf("%s : I can't speak%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s : I can't fly%n", getType());
    }

    @Override
    public void toGo() {
        System.out.printf("%s : I can't walk%n", getType());
    }
}
