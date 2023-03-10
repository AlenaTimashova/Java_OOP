package Java_OOP.HW_2;

public abstract class Animal {
    private String name;
    private final String color;
    private int legsCount;

    private static int animalsCount = 0;

    public Animal(String name, String color, int legsCount) {
        this.name = name;
        this.color = color;
        this.legsCount = legsCount;
        animalsCount++;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
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

    @Override
    public String toString() {
        return this.getType();
    }

     
     public void getInfo() {
         System.out.printf("%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()); 
     }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    

     public abstract void hunt();

}