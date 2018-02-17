package behavioral.chainofresponsibility.handler.receiver;

import behavioral.chainofresponsibility.handler.Handler;

public class Receiver3 extends Handler {

    @Override
    protected double getAllowable() {
        return BASE * 40;
    }

    @Override
    protected String getRole() {
        return  "Vice President";
    }
}
