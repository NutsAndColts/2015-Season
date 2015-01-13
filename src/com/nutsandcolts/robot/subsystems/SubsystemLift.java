package com.nutsandcolts.robot.subsystems;

import com.nutsandcolts.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SubsystemLift extends Subsystem {
    private Talon liftMotor;

    public SubsystemLift() {
        liftMotor = new Talon(RobotMap.liftMotor);
    }

    @Override
    protected void initDefaultCommand() {

    }

    public void set(double speed) {
        liftMotor.set(speed);
    }
}
