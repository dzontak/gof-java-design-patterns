package com.learn.patterns.behaivoral.command;

/**
 * Concrete Command
 */
public class ToggleCommand implements Command {
    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
