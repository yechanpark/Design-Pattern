package behavioral.command;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        
        Button button1 = new Button(lampOnCommand); //������ �Ѵ� Ŀ�ǵ带 ����
        button1.pressed(); // ��ư�� ������ ���� �Ѵ� ����� �����
        
        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);
        
        Button button2 = new Button(alarmOnCommand); //�˶��� �︮�� Ŀ�ǵ带 ����
        button2.pressed(); // ���� ��ư�� ������ �˶��� �︮�� ����� �����
        
        button2.setCommand(lampOnCommand);
        button2.pressed(); // ������ ������ �Ѵ� ����� �����
    }
}