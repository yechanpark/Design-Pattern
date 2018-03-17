package behavioral.strategy.naive;

public abstract class NaiveContext {
    private String name;

    public abstract void attack();
    public abstract void move();

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}

