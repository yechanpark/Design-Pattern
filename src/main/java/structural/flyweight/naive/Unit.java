package structural.flyweight.naive;

public class Unit {
    private Color color;
    private String name;

    public Unit(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name : " + this.name + ", Color : " + this.color.getName());
    }
}
