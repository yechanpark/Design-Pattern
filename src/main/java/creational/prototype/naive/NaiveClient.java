package creational.prototype.naive;

public class NaiveClient {
    public static void main(String args[]) {
        PhotoCopier photoCopier = new PhotoCopier();
        Paper prototypePaper = new Paper("protoype's content");

        Paper copiedPaper = photoCopier.copy(prototypePaper);

        prototypePaper.show();
        copiedPaper.show();

        System.out.println(prototypePaper.hashCode());
        System.out.println(copiedPaper.hashCode());
    }
}
