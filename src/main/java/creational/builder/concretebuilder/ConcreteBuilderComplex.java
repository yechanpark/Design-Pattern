package creational.builder.concretebuilder;

import creational.builder.builder.Builder;
import creational.builder.complexobejct.ComplexObject;
import creational.builder.product.ProductA;
import creational.builder.product.ProductB;

public class ConcreteBuilderComplex<T> implements Builder<T> {
    private ProductA productA;
    private ProductB productB;

    public ConcreteBuilderComplex setProductA(ProductA productA) {
        this.productA = productA;
        return this;
    }

    public ConcreteBuilderComplex setProductB(ProductB productB) {
        this.productB = productB;
        return this;
    }

    @Override
    public T build() {
        return (T) new ComplexObject(this.productA, this.productB);
    }

}
