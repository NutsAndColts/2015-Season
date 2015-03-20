package org.usfirst.frc.team4404.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4404.robot.Robot;
import org.usfirst.frc.team4404.robot.RobotMap;
import org.usfirst.frc.team4404.robot.commands.CmdDriveWithJoystick;

public class SubsystemDrive extends Subsystem {

    private RobotDrive drive;

    public void initDefaultCommand() {
        setDefaultCommand(new CmdDriveWithJoystick());
    }

    public SubsystemDrive() {
        drive = new RobotDrive(RobotMap.leftMotor1, RobotMap.leftMotor2, RobotMap.rightMotor1, RobotMap.rightMotor2);
        drive.setSafetyEnabled(false);
    }


    public void driveWithJoystick(Joystick stick) {
    	double change = (Robot.oi.getSensitiveEnabled()) ? -2.5 : -1;
    	double stickX = stick.getX();
    	double stickY = stick.getY();
    	double driveX = (Math.abs(stickX) < 0.01) ? 0 : (stickX / change) - 0.08;
    	double driveY = (Math.abs(stickY) < 0.01) ? 0 : (stickY / change);
    	SmartDashboard.putNumber("sensitive", change);
    	SmartDashboard.putNumber("stickX", stickX);
    	SmartDashboard.putNumber("stickY", stickY);
    	SmartDashboard.putNumber("driveX", driveX);
    	SmartDashboard.putNumber("driveY", driveY);
        drive.arcadeDrive(driveY, driveX);
    }
    
    public void driveForward() {
    	drive.arcadeDrive(0.5, 0);
    }
    
    public void driveRight() {
    	drive.arcadeDrive(0, -0.5);
    }
}