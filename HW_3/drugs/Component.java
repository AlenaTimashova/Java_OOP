package Java_OOP.HW_3.drugs;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
    
        Component someComponent = (Component) obj;
        return power == someComponent.power
            && (name == someComponent.name
                || (name != null &&name.equals(someComponent.getName()))) 
           && (weight == someComponent.weight
                || (weight != null && weight .equals(someComponent.getWeight())
                ));
    }

    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());             
    result = prime * result + power; 
    result = prime * result + ((weight == null) ? 0 : weight.hashCode()); 
    
    return result;
    }
  
}
