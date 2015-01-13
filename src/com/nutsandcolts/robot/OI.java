package com.nutsandcolts.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    //// CREATING BUTTONS
    // One type of button is a joystick1 button which is any button on a joystick1.
    // You create one by telling it which joystick1 it's on and which button
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

    private static final int JOYSTICK1_PORT = 1;
    private Joystick joystick1;

    private static final int JOYSTICK2_PORT = 2;
    private Joystick joystick2;

    public OI() {
        joystick1 = new Joystick(JOYSTICK1_PORT);
        joystick2 = new Joystick(JOYSTICK2_PORT);
    }

    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
        return joystick2;
    }
}