package org.usfirst.frc.team1155.robot.subsystems;

import org.usfirst.frc.team1155.robot.PortMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

@SuppressWarnings("unused")

public class PistonSubsystem extends Subsystem {

	public DoubleSolenoid solenoid, solenoid2;

	public PistonSubsystem() {
		solenoid = new DoubleSolenoid(PortMap.SolenoidF, PortMap.SolenoidR);
		solenoid2 = new DoubleSolenoid(PortMap.Solenoid2F, PortMap.Solenoid2R);
	}

	public void activatePiston() {
		solenoid.set(DoubleSolenoid.Value.kForward);
		solenoid2.set(DoubleSolenoid.Value.kForward);
	}

	public void deactivatePiston() {
		solenoid.set(DoubleSolenoid.Value.kReverse);
		solenoid2.set(DoubleSolenoid.Value.kReverse);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
