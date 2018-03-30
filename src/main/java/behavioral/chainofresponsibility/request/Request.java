package behavioral.chainofresponsibility.request;

import behavioral.chainofresponsibility.type.RequestType;

public class Request {
    private String requestName;
    private RequestType requestType;

    public Request(RequestType requestType, String requestName) {
        this.requestType = requestType;
        this.requestName = requestName;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestName() {
        return requestName;
    }
}
