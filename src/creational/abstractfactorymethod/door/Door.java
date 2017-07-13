package creational.abstractfactorymethod.door;

public abstract class Door {
    private DoorStatus doorStatus;
 
    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }
 
    public DoorStatus getDoorStatus() {
        return doorStatus;
    }
 
    public void close() { // 템플릿 메서드
        if (doorStatus == DoorStatus.CLOSED) // 이미 문이 닫혀 있으면 아무 동작을 하지 않음
            return;
 
        doClose(); // 실제로 문을 닫는 동작을 수행함, 하위 클래스에서 오버라이드될 것임
        doorStatus = DoorStatus.CLOSED; // 문의 상태를 닫힘으로 기록함
    }
 
    protected abstract void doClose(); // primitive 또는 hook 메서드
    
    public void open() { // 템플릿 메서드
        if (doorStatus == DoorStatus.OPENED) // 이미 문이 열려 있으면 아무 동작을 하지 않음
            return;
 
        doOpen(); // 실제로 문을 여는 동작을 수행함, 하위 클래스에서 오버라이드될 것임
        doorStatus = DoorStatus.OPENED; // 문의 상태를 열림으로 기록함
    }
 
    protected abstract void doOpen(); // primitive 또는 hook 메서드
}