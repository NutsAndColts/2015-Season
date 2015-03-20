package org.usfirst.frc.team4404.robot.subsystems;

import org.usfirst.frc.team4404.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class SubsystemLimiter extends Subsystem {
	
	private DigitalInput limiterDown;

	@Override
	protected void initDefaultCommand() {
		limiterDown = new DigitalInput(RobotMap.limitLiftDown);
	}
	
	public boolean hasReachedLimitDown() {
		SmartDashboard.putBoolean("DownLimit", limiterDown.get());
		return !limiterDown.get();
		//return false;
	}

}
