package behavioral.chainofresponsibility.handler.receiver;

import behavioral.chainofresponsibility.handler.Handler;
import behavioral.chainofresponsibility.request.Request;
import behavioral.chainofresponsibility.type.RequestType;

public class Receiver2 extends Handler {

    @Override
    protected boolean getExecutable(RequestType requestType) {

        if(requestType == RequestType.B)
            return true;

        return false;
    }

    @Override
    protected void execute(Request request) {
        System.out.println(request.getRequestName() + " is Executed by Receiver2");
    }
}
