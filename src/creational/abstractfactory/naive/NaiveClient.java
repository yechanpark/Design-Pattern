package creational.abstractfactory.naive;

import creational.abstractfactory.naive.factory.CPUFactory;
import creational.abstractfactory.naive.factory.CameraFactory;
import creational.abstractfactory.naive.product.Phone;
import creational.abstractfactory.naive.product.camera.Camera;
import creational.abstractfactory.naive.product.cpu.CPU;
import creational.abstractfactory.naive.type.VendorID;

public class NaiveClient {
    public static void main(String args[]) {

        CameraFactory cameraFactory = new CameraFactory();
        Camera camera = cameraFactory.create(VendorID.LG);

        CPUFactory cpuFactory = new CPUFactory();
        CPU cpu = cpuFactory.create(VendorID.LG);

        Phone phone = new Phone();
        phone.setCamera(camera);
        phone.setCPU(cpu);

        phone.info();


    }
}
