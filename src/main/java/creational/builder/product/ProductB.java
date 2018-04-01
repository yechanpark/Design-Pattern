package creational.builder.product;

public class ProductB {
    private char Bvalue1;
    private char Bvalue2;
    private int Bvalue3;
    private String Bvalue4;

    public ProductB(char bvalue1, char bvalue2, int bvalue3, String bvalue4) {
        Bvalue1 = bvalue1;
        Bvalue2 = bvalue2;
        Bvalue3 = bvalue3;
        Bvalue4 = bvalue4;
    }

    public char getBvalue1() {
        return Bvalue1;
    }

    public char getBvalue2() {
        return Bvalue2;
    }

    public int getBvalue3() {
        return Bvalue3;
    }

    public String getBvalue4() {
        return Bvalue4;
    }

}
