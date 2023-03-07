package Java_OOP.HW_1;

public class Animal {
    private String name;
    private final String color;
    private int legsCount;

    public Animal(String name, String color, int legsCount) {
        this.name = name;
        this.color = color;
        this.legsCount = legsCount;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()
        );
    }
    
   private void wakeUp() {
       System.out.println(getType() + ": Animal woke up");
   }

   private void findFood() {
    System.out.printf("%s: found food%n", getType());
   }

   private void eat() {
       System.out.printf("%s: ate%n", getType());
   }

   public void toPlay() {
       System.out.printf("%s: played%n", getType());
   }

   private void goToSleep() {
       System.out.printf("%s: went to sleep%n", getType());
   }

    public void speak() {
        System.out.printf("%s: yarr!%n", getType());
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public void toGo(){
        System.out.printf("%s: I can walk%n", getType());
    }

    public void swim(){
        System.out.printf("%s: I can swim%n", getType());
    }

    public void fly(){
        System.out.printf("%s: I can fly%n", getType());
    }
}
