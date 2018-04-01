package creational.builder.naive;


public class Person {
    private String name;
    private int age;
    private String phoneNumber;
    private int height;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("PhoneNumber : " + this.phoneNumber);
        System.out.println("Height : " + this.height);
        System.out.println("Weight : " + this.weight);
    }
}
