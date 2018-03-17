package behavioral.chainofresponsibility.handler.receiver;

import behavioral.chainofresponsibility.handler.Handler;

public class Receiver4 extends Handler {

    @Override
    protected double getAllowable() {
        return BASE * 60;
    }

    @Override
    protected String getRole() {
        return  "President";
    }
}
