package creational.abstractfactory.naive.product;

import creational.abstractfactory.naive.product.camera.Camera;
import creational.abstractfactory.naive.product.cpu.CPU;

public class Phone {
    private CPU cpu;
    private Camera camera;

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void info(){
        cpu.info();
        camera.info();
    }
}
