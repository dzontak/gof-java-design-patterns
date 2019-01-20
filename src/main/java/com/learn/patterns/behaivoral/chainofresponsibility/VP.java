package com.learn.patterns.behaivoral.chainofresponsibility;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE
        && request.getAmount() < 1500) {
            System.out.println("VP can approve purchases < 1500 ");
        } else {
            getSuccessor().handleRequest(request);;
        }
    }
}
