package creational.abstractfactorymethod;

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
     return new LGMotor();
 }

 @Override
 public Door createDoor() {
     return new LGDoor();
 }
}
