package structural.composite;

import java.util.ArrayList;
import java.util.List;
 
public class Computer extends ComputerDevice {
    // ���� ���� ComputerDevice ��ü�� ����Ŵ
    private List<ComputerDevice> components = new ArrayList<ComputerDevice>();
 
    // ComputerDevice ��ü�� Computer Ŭ������ �߰�
    public void addComponent(ComputerDevice component) {
        components.add(component);
    }
 
    // ComputerDevice ��ü�� Computer Ŭ�������� ����
    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }
 
    // ��ü ������ �����ϴ� �� ��ǰ�� ������ �ջ�
    public int getPrice() {
        int price = 0;
        for (ComputerDevice component : components)
            price += component.getPrice();
        return price;
    }
 
    // ��ü �Һ� ���·��� �����ϴ� �� ��ǰ�� �Һ� ���·��� �ջ�
    public int getPower() {
        int power = 0;
        for (ComputerDevice component : components)
            power += component.getPower();
        return power;
    }
}