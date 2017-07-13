package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.VendorID;
import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.door.LGDoor;
import creational.abstractfactorymethod.motor.LGMotor;
import creational.abstractfactorymethod.motor.Motor;

//�̱��� ������ ������ LG ���丮
public class LGElevatorFactory extends ElevatorFactory {
 private static ElevatorFactory factory;
 private LGElevatorFactory() { }

 public static ElevatorFactory getInstance() {
     if (factory == null)
         factory = new LGElevatorFactory();

     return factory;
 }

 @Override
 public Motor createMotor() {
     return new LGMotor(DoorFactory.createDoor(VendorID.LG));
 }

 @Override
 public Door createDoor() {
     return new LGDoor();
 }
}
