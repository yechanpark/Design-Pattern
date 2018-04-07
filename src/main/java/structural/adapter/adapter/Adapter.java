package structural.adapter.adapter;

import structural.adapter.adaptee.Adaptee;
import structural.adapter.targets.Target;

// Adaptee를 Target이라는 추상적 개념으로 사용할 수 있게 Taget의 구조에 맞게 개조하는 클래스
// Inheritance(Class Adapter) 보단 Composition(Object Adapter)을 사용하는 것이 좋다.
// 아예 Adapter 내부에서 new 연산자를 사용해 구현해도 된다.
public class Adapter implements Target {
    Adaptee adaptee;

    public Target setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
        return this;
    }

    @Override
    public void adaptiveOperation1() {
        adaptee.doLegacyCode1();
        adapterOperation();
    }

    @Override
    public void adaptiveOperation2() {
        adaptee.doLegacyCode2();
        adapterOperation();
    }

    private void adapterOperation() {
        System.out.println("Adapter's Operation");
    }
}
