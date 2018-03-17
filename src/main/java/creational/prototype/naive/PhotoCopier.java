package creational.prototype.naive;

public class PhotoCopier {

    public Paper copy(Paper paper) {
        return new Paper(paper.getContent());
    }

}
