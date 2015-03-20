package org.usfirst.frc.team4404.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4404.robot.commands.CmdMoveLiftDown;
import org.usfirst.frc.team4404.robot.commands.CmdMoveLiftUp;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new CmdDriveForward());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new CmdDriveForward());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new CmdDriveForward());

    private static final int JOYSTICK_PORT = 0;

    private static final int LIFT_UP = 3;
    private static final int LIFT_DOWN = 2;
    
    private static final int SENSITIVE = 1;
    
    private Joystick joystick;

    private JoystickButton liftUp;
    private JoystickButton liftDown;
    
    private JoystickButton sensitiveControls;

    public OI() {
        joystick = new Joystick(JOYSTICK_PORT);

        liftUp = new JoystickButton(joystick, LIFT_UP);
        liftDown = new JoystickButton(joystick, LIFT_DOWN);
        
        sensitiveControls = new JoystickButton(joystick, SENSITIVE);
        
        liftUp.whileHeld(new CmdMoveLiftUp());
        liftDown.whileHeld(new CmdMoveLiftDown());
    }

    public Joystick getJoystick() {
        return joystick;
    }
    
    public boolean getSensitiveEnabled() {
    	return sensitiveControls.get();
    }
}