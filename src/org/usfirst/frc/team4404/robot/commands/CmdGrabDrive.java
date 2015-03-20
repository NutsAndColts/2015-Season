package org.usfirst.frc.team4404.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CmdGrabDrive extends CommandGroup {
	
	public CmdGrabDrive() {
		//addSequential(new CmdMoveLiftDown());
		//addSequential(new CmdMoveLiftUp(), 1);
		//addSequential(new CmdDriveRight(), 1.1);
		addSequential(new CmdDriveForward(), 4);
	}

}
