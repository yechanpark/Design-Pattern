package creational.builder.naive;

public class NaiveClient {
    public static void main(String args[]) {
        Person person = new Person();
        person.setName("Person1");
        person.setAge(20);
        person.setHeight(175);
        person.setWeight(80);

        person.print();
    }
}
