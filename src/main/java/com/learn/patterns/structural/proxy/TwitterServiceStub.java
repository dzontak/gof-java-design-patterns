package com.learn.patterns.structural.proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "my timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
