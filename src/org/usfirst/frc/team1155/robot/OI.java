package org.usfirst.frc.team1155.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team1155.robot.commands.PistonExtendCommand;
import org.usfirst.frc.team1155.robot.commands.PistonRetractCommand;
import org.usfirst.frc.team1155.robot.commands.ServoLeftCommand;
import org.usfirst.frc.team1155.robot.commands.ServoRightCommand;
import org.usfirst.frc.team1155.robot.commands.ServoCommand;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI extends Command {

	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
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
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	
	new JoystickButton(leftJoystick,1).whenPressed(new ServoCommand(SERVO_MODE.MODE1));
	new JoystickButton(leftJoystick,2).whenPressed(new ServoCommand(SERVO_MODE.MODE2));

	public static XboxController gamepad = new XboxController(PortMap.xboxController);

	private JoystickButton pistonExtend, pistonRetract, servoFullRight, servoFullLeft;

	public OI() { // change these buttons later
		pistonExtend = new JoystickButton(gamepad, PortMap.XBOX_CONTROLLER_X);
		pistonRetract = new JoystickButton(gamepad, PortMap.XBOX_CONTROLLER_Y);
	}

	protected void initialize() {
	}

	protected void execute() {
		pistonExtend.whenPressed(new PistonExtendCommand());
		pistonRetract.whenPressed(new PistonRetractCommand());
		
	}

	protected boolean isFinished() {
		return false;
	}

}


	public OI() { // change these buttons later
		pistonExtend = new JoystickButton(gamepad, PortMap.XBOX_CONTROLLER_X);
		pistonRetract = new JoystickButton(gamepad, PortMap.XBOX_CONTROLLER_Y);
		servoFullRight = new JoystickButton(gamepad, PortMap.XBOX_CONTROLLER_B);
		servoFullLeft = new JoystickButton(gamepad, PortMap.XBOX_CONTROLLER_A);
	}

	protected void initialize() {
	}

	protected void execute() {
		pistonExtend.whenPressed(new PistonExtendCommand());
		pistonRetract.whenPressed(new PistonRetractCommand());
		servoFullRight.whenPressed(new ServoRightCommand());
		servoFullLeft.whenPressed(new ServoLeftCommand());
	}

	protected boolean isFinished() {
		return false;
	}

}
