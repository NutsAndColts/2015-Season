package org.usfirst.frc.team4404.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4404.robot.Robot;

public class CmdRotateArmIdle extends Command {
	
    public CmdRotateArmIdle() {
        requires(Robot.subsystemArm);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.subsystemArm.rotateMotorIdle();
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