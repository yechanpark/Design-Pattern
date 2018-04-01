package creational.builder.concretebuilder;

import creational.builder.builder.Builder;
import creational.builder.product.ProductA;

public class ConcreteBuilderA<T> implements Builder<T> {
    private String Avalue1;
    private int Avalue2;
    private int Avalue3;
    private String Avalue4;

    public ConcreteBuilderA setAvalue1(String Avalue1) {
        this.Avalue1 = Avalue1;
        return this;
    }

    public ConcreteBuilderA setAvalue2(int Avalue2) {
        this.Avalue2 = Avalue2;
        return this;
    }

    public ConcreteBuilderA setAvalue3(int Avalue3) {
        this.Avalue3 = Avalue3;
        return this;
    }

    public ConcreteBuilderA setAvalue4(String Avalue4) {
        this.Avalue4 = Avalue4;
        return this;
    }

    @Override
    public T build() {
        return (T) new ProductA(Avalue1, Avalue2, Avalue3, Avalue4);
    }

}
