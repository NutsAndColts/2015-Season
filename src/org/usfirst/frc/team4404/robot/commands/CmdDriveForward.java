package org.usfirst.frc.team4404.robot.commands;

import org.usfirst.frc.team4404.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CmdDriveForward extends Command {
	
	public CmdDriveForward() {
		requires(Robot.subsystemDrive);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		Robot.subsystemDrive.driveForward();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}
