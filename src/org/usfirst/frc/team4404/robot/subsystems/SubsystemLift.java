package org.usfirst.frc.team4404.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4404.robot.RobotMap;
import org.usfirst.frc.team4404.robot.commands.CmdMoveLiftIdle;

public class SubsystemLift extends Subsystem {

    private Victor lift;

    public SubsystemLift() {
        lift = new Victor(RobotMap.liftMotor);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new CmdMoveLiftIdle());
    }

    public void moveLiftUp() {
        lift.set(1);
    }

    public void moveLiftDown() {
    	lift.set(-1);
    }

    public void stopLift() {
        lift.set(0);
    }
}