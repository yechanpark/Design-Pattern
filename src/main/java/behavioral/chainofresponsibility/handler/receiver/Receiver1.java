package behavioral.chainofresponsibility.handler.receiver;

import behavioral.chainofresponsibility.handler.Handler;

public class Receiver1 extends Handler {

    @Override
    protected double getAllowable() {
        return BASE * 10;
    }

    @Override
    protected String getRole() {
        return "Manager";
    }
}
