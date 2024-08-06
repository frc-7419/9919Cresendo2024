// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.hanger;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

// All required classes.

public class RunHangerWithJoystick extends Command {
  /** Creates a new RunHangerWithJoystick. */

  // Declare the subsystem and controller variables

  public RunHangerWithJoystick() {
    // Initialize the subsystem and controller variables

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Initalize the hanger
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Read joystick input (RightY) and set the hanger motor voltage
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Stop the hanger and set a break.
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
