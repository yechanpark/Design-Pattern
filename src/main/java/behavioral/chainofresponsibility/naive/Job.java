package behavioral.chainofresponsibility.naive;

public class Job {
    private char type;

    public Job(char type) {
        this.type = type;
    }

    public char getType(){
        return this.type;
    }
}

