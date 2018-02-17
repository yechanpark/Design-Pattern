package behavioral.chainofresponsibility.handler;

import behavioral.chainofresponsibility.Request.Request;

public abstract class Handler {
    protected static final double BASE = 500;
    protected Handler handler;

    protected abstract double getAllowable();
    protected abstract String getRole();

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(Request request) {
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else if (handler != null) {
            handler.handleRequest(request);
        }
    }

}
