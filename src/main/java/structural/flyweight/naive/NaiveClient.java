package structural.flyweight.naive;

public class NaiveClient {
    public static void main(String args[]) {
        Unit unit1 = new Unit("unit1", new Color("Red"));
        Unit unit2 = new Unit("unit2", new Color("Red"));
        Unit unit3 = new Unit("unit3", new Color("Red"));

        Unit unit4 = new Unit("unit4", new Color("Blue"));
        Unit unit5 = new Unit("unit5", new Color("Blue"));
        Unit unit6 = new Unit("unit6", new Color("Blue"));

        unit1.display();
        unit2.display();
        unit3.display();

        unit4.display();
        unit5.display();
        unit6.display();
    }
}
