package creational.abstractfactorymethod;

public class SamsungElevatorFactory extends ElevatorFactory { // 伙己 何前阑 积己窍绰 伙己 蒲配府
    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }
 
    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}