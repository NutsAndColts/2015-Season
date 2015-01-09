package com.nutsandcolts.robot.commands;

import com.nutsandcolts.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CmdDriveWithJoystick extends Command {

    public CmdDriveWithJoystick() {
        requires(Robot.subsystemDrive);
    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.subsystemDrive.driveWithJoystick(Robot.oi.getJoystick());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}