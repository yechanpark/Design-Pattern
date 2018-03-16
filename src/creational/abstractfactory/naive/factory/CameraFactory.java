package creational.abstractfactory.naive.factory;

import creational.abstractfactory.naive.product.camera.Camera;
import creational.abstractfactory.naive.product.camera.LGCamera;
import creational.abstractfactory.naive.product.camera.SamsungCamera;
import creational.abstractfactory.naive.product.camera.UnknownCamera;
import creational.abstractfactory.naive.type.VendorID;

public class CameraFactory {

    public Camera create(VendorID vendorID){

        switch (vendorID) {
            case LG:
                return new LGCamera();

            case SAMSUNG:
                return new SamsungCamera();

            default:
                return new UnknownCamera();

        }

    }
}

