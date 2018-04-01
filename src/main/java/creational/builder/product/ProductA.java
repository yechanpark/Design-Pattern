package creational.builder.product;

public class ProductA {
    private String Avalue1;
    private int Avalue2;
    private int Avalue3;
    private String Avalue4;

    public ProductA(String avalue1, int avalue2, int avalue3, String avalue4) {
        Avalue1 = avalue1;
        Avalue2 = avalue2;
        Avalue3 = avalue3;
        Avalue4 = avalue4;
    }
    public String getAvalue1() {
        return Avalue1;
    }

    public int getAvalue2() {
        return Avalue2;
    }

    public int getAvalue3() {
        return Avalue3;
    }

    public String getAvalue4() {
        return Avalue4;
    }

}
