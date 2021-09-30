// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;


public class Trigger extends CommandBase {
  private final DoubleSupplier yaddaYadda;

  /**
   * 
   * @param yaddaYadda
   */

  /** Creates a new ArcadeDrive. */
  public Trigger(DoubleSupplier trigger) {
    // Use addRequirements() here to declare subsystem dependencies.
    yaddaYadda = trigger;
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println(yaddaYadda.getAsDouble());
  }
}
