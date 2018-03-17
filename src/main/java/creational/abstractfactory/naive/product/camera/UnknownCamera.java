package creational.abstractfactory.naive.product.camera;

public class UnknownCamera extends Camera {
    @Override
    public void info() {
        System.out.println("Unknown Camera");
    }
}
