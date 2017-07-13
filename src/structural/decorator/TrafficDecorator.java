package structural.decorator;

public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay); // �θ� Ŭ������ �����ڸ� ȣ��
    }
 
    public void draw() {
        super.draw();
        drawLane();
    }
 
    private void drawLane() {
        System.out.println("\t���뷮 ǥ��");
    }
}