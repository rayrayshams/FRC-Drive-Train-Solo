// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

import java.util.function.DoubleSupplier;


public class ArcadeDrive extends CommandBase {
  private final DriveTrainSubsystem m_drive;
  private final DoubleSupplier m_forward;
  private final DoubleSupplier m_rotation;

  /**
   * 
   * @param drive
   * @param forward
   * @param rotation
   */

  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(DriveTrainSubsystem drive, DoubleSupplier forward, DoubleSupplier rotation) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_drive = drive;
    
    m_forward = forward ;//> 1.0 ? 1.0 : forward.getAsDouble() < -1.0 ? -1.0 : forward.getAsDouble();
    m_rotation = rotation ;//> 1.0 ? 1.0 : rotation.getAsDouble() < -1.0 ? -1.0 : rotation.getAsDouble();
    addRequirements(m_drive);
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drive.arcadeDrive(m_forward.getAsDouble(), -m_rotation.getAsDouble());
  }
}
