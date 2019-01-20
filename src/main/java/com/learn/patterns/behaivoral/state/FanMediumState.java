package com.learn.patterns.behaivoral.state;

public class FanMediumState extends State {


    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    void handleRequest() {
        System.out.println("Turning fan on to High");
        this.fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "Fan is on Medium";
    }
}
