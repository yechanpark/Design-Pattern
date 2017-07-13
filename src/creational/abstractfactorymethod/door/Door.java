package creational.abstractfactorymethod.door;

public abstract class Door {
    private DoorStatus doorStatus;
 
    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }
 
    public DoorStatus getDoorStatus() {
        return doorStatus;
    }
 
    public void close() { // ���ø� �޼���
        if (doorStatus == DoorStatus.CLOSED) // �̹� ���� ���� ������ �ƹ� ������ ���� ����
            return;
 
        doClose(); // ������ ���� �ݴ� ������ ������, ���� Ŭ�������� �������̵�� ����
        doorStatus = DoorStatus.CLOSED; // ���� ���¸� �������� �����
    }
 
    protected abstract void doClose(); // primitive �Ǵ� hook �޼���
    
    public void open() { // ���ø� �޼���
        if (doorStatus == DoorStatus.OPENED) // �̹� ���� ���� ������ �ƹ� ������ ���� ����
            return;
 
        doOpen(); // ������ ���� ���� ������ ������, ���� Ŭ�������� �������̵�� ����
        doorStatus = DoorStatus.OPENED; // ���� ���¸� �������� �����
    }
 
    protected abstract void doOpen(); // primitive �Ǵ� hook �޼���
}