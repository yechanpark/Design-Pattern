package behavioral.chainofresponsibility.handler.receiver;

import behavioral.chainofresponsibility.handler.Handler;
import behavioral.chainofresponsibility.request.Request;
import behavioral.chainofresponsibility.type.RequestType;

// Default Handler
public class Receiver4 extends Handler {
    @Override
    protected boolean getExecutable(RequestType requestType) {
        return true;
    }

    @Override
    protected void execute(Request request) {
        System.out.println(request.getRequestName() + " is Executed by Default Receiver");
    }
}
