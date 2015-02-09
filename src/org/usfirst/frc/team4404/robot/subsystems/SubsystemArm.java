package org.usfirst.frc.team4404.robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4404.robot.RobotMap;
import org.usfirst.frc.team4404.robot.commands.CmdRotateArmIdle;

public class SubsystemArm extends Subsystem {

    private Jaguar jaguar;

    public SubsystemArm() {
    	jaguar = new Jaguar(RobotMap.armMotor);
    }
    
    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new CmdRotateArmIdle());
    }


    public void rotateMotorLeft() {
    	jaguar.set(-1);
    }
    
    public void rotateMotorRight() {
    	jaguar.set(1);
    }
    
    public void rotateMotorIdle() {
    	jaguar.set(0);
    }
}