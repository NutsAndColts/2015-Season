package org.usfirst.frc.team4404.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4404.robot.Robot;

public class CmdMoveLiftUp extends Command {
	
    public CmdMoveLiftUp() {
        requires(Robot.subsystemLift);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
    	/*if (Robot.oi.hasLimitReachedUp()) {
			return;
		}*/
    	
        Robot.subsystemLift.moveLiftUp();
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