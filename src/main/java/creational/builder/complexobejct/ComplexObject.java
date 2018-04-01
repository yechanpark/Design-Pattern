package creational.builder.complexobejct;

import creational.builder.product.ProductA;
import creational.builder.product.ProductB;

public class ComplexObject {
    private ProductA productA;
    private ProductB productB;

    public ComplexObject(ProductA productA, ProductB productB) {
        this.productA = productA;
        this.productB = productB;
    }

    public void print() {
        System.out.println("ComplexObject# ProductA Value 1 : " + this.productA.getAvalue1());
        System.out.println("ComplexObject# ProductA Value 2 : " + this.productA.getAvalue2());
        System.out.println("ComplexObject# ProductA Value 3 : " + this.productA.getAvalue3());
        System.out.println("ComplexObject# ProductA Value 4 : " + this.productA.getAvalue4());
        System.out.println();
        System.out.println("ComplexObject# ProductB Value 1 : " + this.productB.getBvalue1());
        System.out.println("ComplexObject# ProductB Value 2 : " + this.productB.getBvalue2());
        System.out.println("ComplexObject# ProductB Value 3 : " + this.productB.getBvalue3());
        System.out.println("ComplexObject# ProductB Value 4 : " + this.productB.getBvalue4());
    }

}
