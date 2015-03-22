package org.usfirst.frc.team4404.robot.commands;

import org.usfirst.frc.team4404.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CmdDriveForward extends Command {
	
	double driveSpeed;
	
	public CmdDriveForward() {
		requires(Robot.subsystemDrive);
		driveSpeed = 0.6;
	}
	
	public CmdDriveForward(double speed) {
		requires(Robot.subsystemDrive);
		driveSpeed = speed;
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		Robot.subsystemDrive.driveForward(driveSpeed);
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
