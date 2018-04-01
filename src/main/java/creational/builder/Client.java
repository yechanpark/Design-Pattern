package creational.builder;

import creational.builder.builder.Builder;
import creational.builder.complexobejct.ComplexObject;
import creational.builder.concretebuilder.ConcreteBuilderA;
import creational.builder.concretebuilder.ConcreteBuilderB;
import creational.builder.concretebuilder.ConcreteBuilderComplex;
import creational.builder.product.ProductA;
import creational.builder.product.ProductB;

public class Client {
    public static void main(String args[]) {
        Builder<ProductA> productABuilder
                = new ConcreteBuilderA<ProductA>()
                    .setAvalue2(1)
                    //.setAvalue1("aString")
                    .setAvalue3(2)
                    .setAvalue4("bString");

        Builder<ProductB> productBBuilder
                = new ConcreteBuilderB<ProductB>()
                    .setBvalue4("cString")
                    .setBvalue1('a')
                    .setBvalue2('b')
                    .setBvalue1('c')
                    .setBvalue3(3);

        Builder<ComplexObject> complexObjectBuilder
                = new ConcreteBuilderComplex<ComplexObject>()
                    .setProductA(productABuilder.build())
                    .setProductB(productBBuilder.build());

        ComplexObject complexObject = complexObjectBuilder.build();
        complexObject.print();

    }
}