package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.request.Request;
import behavioral.chainofresponsibility.handler.Handler;
import behavioral.chainofresponsibility.handler.receiver.Receiver1;
import behavioral.chainofresponsibility.handler.receiver.Receiver2;
import behavioral.chainofresponsibility.handler.receiver.Receiver3;
import behavioral.chainofresponsibility.handler.receiver.Receiver4;
import behavioral.chainofresponsibility.type.RequestType;

import java.util.ArrayList;
import java.util.List;

// Sender
public class Client {
    public static void main(String args[]) {

        Handler handler1 = new Receiver1();
        Handler handler2 = new Receiver2();
        Handler handler3 = new Receiver3();
        Handler defaultHandler = new Receiver4();

        Handler requestsHandler
                = handler1.setHandler(
                        handler2.setHandler(
                                handler3.setHandler(defaultHandler)
                        )
                  );

        List<Request> requestList = new ArrayList<Request>();
        requestList.add(new Request(RequestType.A, "A-1 Job"));
        requestList.add(new Request(RequestType.C, "C-1 Job"));
        requestList.add(new Request(RequestType.E, "E-1 Job"));
        requestList.add(new Request(RequestType.F, "F-1 Job"));
        requestList.add(new Request(RequestType.B, "B-1 Job"));
        requestList.add(new Request(RequestType.A, "A-2 Job"));
        requestList.add(new Request(RequestType.F, "F-2 Job"));

        for(Request request : requestList)
            requestsHandler.handleRequest(request);
    }
}