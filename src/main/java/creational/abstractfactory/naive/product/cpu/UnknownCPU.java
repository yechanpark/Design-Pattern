package creational.abstractfactory.naive.product.cpu;

public class UnknownCPU extends CPU {
    @Override
    public void info() {
        System.out.println("Unknown CPU");
    }
}
