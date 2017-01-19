
package org.usfirst.frc.team1155.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1155.robot.Robot;

/**
 *
 */
public class PistonCommand extends Command {
	
	public static GenericHID xBoxController = new GenericHID(PortMap.xboxController);
	public static JoystickButton raiseButton, lowerButton;
	private PistonSubsystem use = new PistonSubsystem();

    public PistonCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(use);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	raiseButton = new JoystickButton(xBoxController, PortMap.xboxControllerX);
    	lowerButton = new JoystickButton(xBoxController, PortMap.xboxControllerY);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(raiseButton.get()){
    		use.activatePiston;
    	} 
    	
    	if(lowerButton.get()){
    		use.deactivatePiston;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
