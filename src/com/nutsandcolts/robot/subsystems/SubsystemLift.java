package com.nutsandcolts.robot.subsystems;

import com.nutsandcolts.robot.RobotMap;
import com.nutsandcolts.robot.commands.MoveLiftWithJoystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SubsystemLift extends Subsystem {
    private Talon liftMotor;

    public SubsystemLift() {
        liftMotor = new Talon(RobotMap.liftMotor);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new MoveLiftWithJoystick());
    }

    public void set(double speed) {
        liftMotor.set(speed);
    }
}
