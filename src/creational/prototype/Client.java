/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Prototype Pattern - Client
 * */
package creational.prototype;

import creational.prototype.concreteprototype.ConcretePrototype;
import creational.prototype.prototype.Prototype;

// Caretaker, Client Class
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public Prototype copyConcretePrototype() throws CloneNotSupportedException {
        return (Prototype) prototype.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException {
        Prototype copiedPrototype = null;
        Prototype prototype = new ConcretePrototype();

        prototype.setValue(1);

        Client client = new Client(prototype);
        copiedPrototype = client.copyConcretePrototype(); // prototype을 복사한 객체를 할당

        // prototype객체의 value값은 3으로 설정
        prototype.setValue(3);

        // prototype객체를 복사한 객체의 value값은, prototype객체에 대한 복사시점의 value값 + 1
        copiedPrototype.setValue(copiedPrototype.getValue()+1);

        /* clone()이 서로 다른 객체를 만들어 주는 것을 검증 */
        // 해시값이 다르므로 다른 객체이다.
        System.out.println(((ConcretePrototype)prototype).hashCode());
        System.out.println(((ConcretePrototype)copiedPrototype).hashCode());

        // prototype 객체의 value값을 3으로 세팅하여 value값은 3
        System.out.println("prototype객체의 value값 : " + prototype.getValue());

        // prototype 객체의 value값이 1일때 복사된 객체. +1 되어 value값은 2
        System.out.println("copiedPrototype객체의 value값 : " + copiedPrototype.getValue());

    }
}