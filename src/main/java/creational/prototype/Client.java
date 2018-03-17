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

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype copyConcretePrototype() throws CloneNotSupportedException {
        return (Prototype) prototype.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype(); // 원본
        Prototype copiedPrototype = null; // 복사본

        // 원본 객체의 초기 value값 : 1
        prototype.setValue(1);

        // 원본(prototype) 객체를 복사하여 복사본(copiedPrototype) 객체를 생성
        Client client = new Client(prototype);
        copiedPrototype = client.copyConcretePrototype();

        // 원본 객체의 value값 : 3
        prototype.setValue(3);

        // 복사본 객체의 value값 : (원본 객체로부터 복사된 시점의 값) +1
        copiedPrototype.setValue( copiedPrototype.getValue()+1 );

        /* clone()이 서로 다른 객체를 만들어 주는 것을 검증 */
        // 해시값이 다르므로 다른 객체이다.
        System.out.println( ((ConcretePrototype)prototype).hashCode() ); // 원본
        System.out.println( ((ConcretePrototype)copiedPrototype).hashCode() ); // 복사본

        // 원본 객체의 value값 : 3
        System.out.println("prototype객체의 value값 : " + prototype.getValue());

        // prototype 객체의 value값이 1일때 복사된 객체. +1 되어 value값은 2
        System.out.println("copiedPrototype객체의 value값 : " + copiedPrototype.getValue());

    }
}