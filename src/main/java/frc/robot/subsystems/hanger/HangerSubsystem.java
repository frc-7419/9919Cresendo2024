// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.hanger;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.NeutralModeValue;
import com.ctre.phoenix6.configs.TalonFXConfigurator;
import com.ctre.phoenix6.controls.CoastOut;
import com.ctre.phoenix6.controls.StaticBrake;
import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.configs.SoftwareLimitSwitchConfigs;

// All required classes.

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.HangerConstants;

public class HangerSubsystem extends SubsystemBase {
  /** Creates a new HangerSubsystem. */

  /*
   * Simple Winch Hanger
   * Will use either a Falcon or Kraken
   * 
   * Similar to the hanger on 7419.
  */

  private TalonFX hanger;
  private VoltageOut m_request = new VoltageOut(0);

  public HangerSubsystem() {
    hanger = new TalonFX(HangerConstants.hangerMotorID);
    coast();
    
    // Extra: Set up the software limits for the hanger motor 
  }

  // Method to request applied voltage (double volts) to the hanger motor

  public void setVoltage(double voltage) {
    hanger.setControl(m_request.withOutput(voltage));
  }

  // The other basic motor control methods. Eg coast, brake, etc.

  public void coast() {
    hanger.setNeutralMode(NeutralModeValue.Coast);
  }

  public void brake() {
    hanger.setNeutralMode(NeutralModeValue.Brake);
  }

  public void stop() {
    hanger.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
