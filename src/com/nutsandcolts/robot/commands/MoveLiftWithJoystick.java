package com.nutsandcolts.robot.commands;

import com.nutsandcolts.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class MoveLiftWithJoystick extends Command {
    @Override
    protected void initialize() {
        requires(Robot.subsystemLift);
    }

    @Override
    protected void execute() {
        Robot.subsystemLift.set((float) Robot.oi.getJoystick2().getThrottle());
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {

    }
}
