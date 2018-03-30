package behavioral.chainofresponsibility.handler;

import behavioral.chainofresponsibility.request.Request;
import behavioral.chainofresponsibility.type.RequestType;

public abstract class Handler {
    protected Handler handler;

    protected abstract boolean getExecutable(RequestType requestType);
    protected abstract void execute(Request request);

    public Handler setHandler(Handler handler) {
        this.handler = handler;
        return this;
    }

    public void handleRequest(Request request) {

        if (this.getExecutable(request.getRequestType()))
            execute(request);

        else if (handler != null)
            handler.handleRequest(request);

    }
}
