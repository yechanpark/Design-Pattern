package creational.abstractfactorymethod;

import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.factory.ElevatorFactory;
import creational.abstractfactorymethod.factory.ElevatorFactoryFactory;
import creational.abstractfactorymethod.motor.Motor;

public class Client {
    public static void main(String[] args) {
        String vendorName = args[0];
        VendorID vendorID;
        
        if (vendorName.equalsIgnoreCase("LG"))
            vendorID = VendorID.LG;
        else if (vendorName.equalsIgnoreCase("SAMSUNG"))
            vendorID = VendorID.SAMSUNG;
        else
            vendorID = VendorID.HYUNDAI;
 
        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);
        
        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);
 
        door.open();
        motor.move(Direction.UP);
    }
}