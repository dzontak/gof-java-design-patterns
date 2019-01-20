package com.learn.patterns.behaivoral.mediator;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {

    private Timer timer;

    public MediatorEverydayDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println("About to schedule a task");
        new MediatorEverydayDemo(3);
        System.out.println("Task Scheduled");
    }

    private class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time's up");
        }
    }

    private class RemindTaskWithoutBeep extends TimerTask {
        @Override
        public void run() {
            System.out.println("Now Time is really up.");
            timer.cancel();
        }
    }
}
