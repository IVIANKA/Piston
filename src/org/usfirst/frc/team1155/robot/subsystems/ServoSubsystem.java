package org.usfirst.frc.team1155.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1155.robot.PortMap;

public class ServoSubsystem extends Subsystem {

	public enum SERVO_MODE {
		MODE1,
		MODE2
	}
	
	public Servo servo;

	public ServoSubsystem() {
		servo = new Servo(PortMap.Servo);
	}

	public void setServo(double position) {
		servo.set(position);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
