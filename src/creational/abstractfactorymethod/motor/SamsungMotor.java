package creational.abstractfactorymethod.motor;

import creational.abstractfactorymethod.Direction;
import creational.abstractfactorymethod.door.Door;

public class SamsungMotor extends Motor {
    public SamsungMotor(Door door) {
        super(door);
    }
 
    protected void moveMotor(Direction direction) {
        // Samsung Motor∏¶ ±∏µø Ω√≈¥
    	System.out.println("SamsungMotor move " + direction.toString());
    }
}