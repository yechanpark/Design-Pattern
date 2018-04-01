package creational.builder.concretebuilder;

import creational.builder.builder.Builder;
import creational.builder.product.ProductB;

public class ConcreteBuilderB<T> implements Builder<T> {
    private char Bvalue1;
    private char Bvalue2;
    private int Bvalue3;
    private String Bvalue4;

    public ConcreteBuilderB setBvalue1(char Bvalue1) {
        this.Bvalue1 = Bvalue1;
        return this;
    }

    public ConcreteBuilderB setBvalue2(char Bvalue2) {
        this.Bvalue2 = Bvalue2;
        return this;
    }

    public ConcreteBuilderB setBvalue3(int Bvalue3) {
        this.Bvalue3 = Bvalue3;
        return this;
    }

    public ConcreteBuilderB setBvalue4(String Bvalue4) {
        this.Bvalue4 = Bvalue4;
        return this;
    }

    @Override
    public T build() {
        return (T) new ProductB(Bvalue1, Bvalue2, Bvalue3, Bvalue4);
    }

}
