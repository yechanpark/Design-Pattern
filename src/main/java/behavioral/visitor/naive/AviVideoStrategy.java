package behavioral.visitor.naive;

public class AviVideoStrategy implements VideoStrategy {
    @Override
    public void doVideo() {
        System.out.println(this.getClass().getSimpleName() + "# doVideo()");
    }
}
