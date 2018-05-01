package behavioral.visitor.naive;

public class MpegVideoStrategy implements VideoStrategy {
    @Override
    public void doVideo() {
        System.out.println(this.getClass().getSimpleName() + "# doVideo()");
    }
}
