package com.learn.patterns.behaivoral.state;

public abstract class State {

    Fan fan;
    abstract void handleRequest();
}
