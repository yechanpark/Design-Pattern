package behavioral.visitor.naive;

public class NaiveClient {
    public static void main(String args[]) {
        VideoStrategy videoStrategy;
        videoStrategy = new MpegVideoStrategy();
        videoStrategy.doVideo();

        videoStrategy = new AviVideoStrategy();
        videoStrategy.doVideo();

    }
}
