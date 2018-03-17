package behavioral.chainofresponsibility.handler.receiver;

import behavioral.chainofresponsibility.handler.Handler;

public class Receiver2 extends Handler {

    @Override
    protected double getAllowable() {
        return BASE * 20;
    }

    @Override
    protected String getRole() {
        return "Director";
    }
}
