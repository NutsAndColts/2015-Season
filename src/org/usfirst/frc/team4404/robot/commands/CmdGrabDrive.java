package org.usfirst.frc.team4404.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class CmdGrabDrive extends CommandGroup {
	
	public CmdGrabDrive() {
		addSequential(new CmdMoveLiftDown());
		addSequential(new WaitCommand(1));
		addSequential(new CmdMoveLiftUp(), 0.5);
		addSequential(new WaitCommand(1));
		addSequential(new CmdDriveRight(), 1.4);
		addSequential(new CmdDriveForward(), 1);
		addSequential(new CmdDriveForward(0.4), 0.5);
		addSequential(new CmdDriveForward(0.1), 0.5);
	}

}
