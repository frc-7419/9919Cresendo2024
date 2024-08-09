// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.hanger;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.hanger.HangerSubsystem;

// All required classes.

public class RunHangerWithJoystick extends Command {
  /** Creates a new RunHangerWithJoystick. */

  // Declare the subsystem and controller variables
  HangerSubsystem hangerSubsystem;
  private XboxController joystick;

  public RunHangerWithJoystick(HangerSubsystem hangerSubsystem, XboxController joystick) {
    // Initialize the subsystem and controller variables
    this.hangerSubsystem = hangerSubsystem;
    this.joystick = joystick;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hangerSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Initalize the hanger
    hangerSubsystem.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Read joystick input (RightY) and set the hanger motor voltage
    hangerSubsystem.setVoltage(joystick.getRightY()*12); // I multiplied by 12 because max volts is 12 and max joystick value is 1; idk if that is right
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Stop the hanger and set a break.
    hangerSubsystem.stop();
    hangerSubsystem.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
