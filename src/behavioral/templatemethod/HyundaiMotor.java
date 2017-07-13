package behavioral.templatemethod;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }
 
    protected void moveMotor(Direction direction) {
        // Hyundai Motor�� ������Ŵ
    	System.out.println("HyundaiMotor move " + direction.toString());
    }
}