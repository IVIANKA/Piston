package org.usfirst.frc.team1155.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1155.robot.PortMap;

public class ServoSubsystem extends Subsystem {

	public Servo servo, servo1;

	public ServoSubsystem() {
		servo = new Servo(PortMap.Servo);
		servo1 = new Servo(PortMap.Servo1);
	}

	public void fullRightServo (){
		servo.set(1);
		servo1.set(1);
	}

	public void fullLeftServo (){
		servo.set(0);
		servo1.set(0);
	}
	
	public void directMiddleServo (){
		servo.set(0.5);
		servo1.set(0.5);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
