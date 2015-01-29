package com.nutsandcolts.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.nutsandcolts.robot.RobotMap;
import com.nutsandcolts.robot.commands.CmdDriveWithJoystick;

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
        drive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getTwist(), 0);
    }
}