/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Prototype Pattern - Prototype
 * */
package creational.prototype.prototype;

public abstract class Prototype implements Cloneable{

    int value;

    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
