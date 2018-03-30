package behavioral.chainofresponsibility.handler.receiver;

import behavioral.chainofresponsibility.request.Request;
import behavioral.chainofresponsibility.handler.Handler;
import behavioral.chainofresponsibility.type.RequestType;

public class Receiver1 extends Handler {

    @Override
    protected boolean getExecutable(RequestType requestType) {

        if(requestType == RequestType.A)
            return true;

        return false;
    }

    @Override
    protected void execute(Request request) {
        System.out.println(request.getRequestName() + " is Executed by Receiver1");
    }
}
