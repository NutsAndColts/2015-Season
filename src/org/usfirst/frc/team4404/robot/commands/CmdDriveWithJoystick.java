package org.usfirst.frc.team4404.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4404.robot.Robot;

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