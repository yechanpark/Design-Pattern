package creational.abstractfactory.naive.factory;

import creational.abstractfactory.naive.product.cpu.CPU;
import creational.abstractfactory.naive.product.cpu.LGCPU;
import creational.abstractfactory.naive.product.cpu.SamsungCPU;
import creational.abstractfactory.naive.product.cpu.UnknownCPU;
import creational.abstractfactory.naive.type.VendorID;

public class CPUFactory {

    public CPU create(VendorID vendorID){

        switch (vendorID) {
            case LG:
                return new LGCPU();

            case SAMSUNG:
                return new SamsungCPU();

            default:
                return new UnknownCPU();

        }

    }
}
