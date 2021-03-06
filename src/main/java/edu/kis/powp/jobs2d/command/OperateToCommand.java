package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

    final private Job2dDriver job2dDriver;
    private int startX = 0, startY = 0;

    public OperateToCommand(Job2dDriver job2dDriver, int startX, int startY) {
        this.job2dDriver = job2dDriver;
        this.startX = startX;
        this.startY = startY;
    }

    @Override public void execute() {
        job2dDriver.operateTo(startX,startY);
    }
}
