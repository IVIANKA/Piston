package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Robot;
import org.usfirst.frc.team1155.robot.subsystems.ServoSubsystem;
import org.usfirst.frc.team1155.robot.subsystems.ServoSubsystem.SERVO_MODE;

import edu.wpi.first.wpilibj.command.Command;

public class ServoCommand extends Command {

	private SERVO_MODE currentMode;
	
	public ServoCommand(SERVO_MODE mode) {
		requires(Robot.servo);
		
		currentMode = mode;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		if(currentMode = SERVO_MODE.MODE1) {
			servo.set(1);
		}else {
			servo.set(0);
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
//		Robot.servo.fullLeftServo();
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
