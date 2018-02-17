package behavioral.chainofresponsibility.Request;

public class Request {
    private double amount;
    private String purpose;

    public Request(double amout, String purpose) {
        this.amount = amout;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
