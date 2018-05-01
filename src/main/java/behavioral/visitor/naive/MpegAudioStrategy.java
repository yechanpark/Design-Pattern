package behavioral.visitor.naive;

public class MpegAudioStrategy implements AudioStrategy {
    @Override
    public void doAudio() {
        System.out.println(this.getClass().getSimpleName() + "# doAudio()");
    }
}
