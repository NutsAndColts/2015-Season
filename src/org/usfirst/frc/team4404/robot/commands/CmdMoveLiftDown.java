package org.usfirst.frc.team4404.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4404.robot.Robot;

public class CmdMoveLiftDown extends Command {
	
    public CmdMoveLiftDown() {
        requires(Robot.subsystemLift);
        requires(Robot.subsystemLimiter);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
    	/*if (Robot.oi.hasLimitReachedDown()) {
    		return;
    	}*/
    	
        Robot.subsystemLift.moveLiftDown();
    }

    @Override
    protected boolean isFinished() {
    	return Robot.subsystemLimiter.hasReachedLimitDown();
    }

    @Override
    protected void end() {
    	Robot.subsystemLift.stopLift();
    }

    @Override
    protected void interrupted() {

    }
}