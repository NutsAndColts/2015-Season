package org.usfirst.frc.team4404.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4404.robot.Robot;

public class CmdMoveLiftDown extends Command {
    public CmdMoveLiftDown() {
        requires(Robot.subsystemLift);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.subsystemLift.moveLiftDown();
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
