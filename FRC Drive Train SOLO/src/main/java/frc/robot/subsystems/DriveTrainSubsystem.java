// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class DriveTrainSubsystem extends SubsystemBase {
  /* left motors */
  public WPI_VictorSPX m_leftFront = new WPI_VictorSPX(Constants.CAN.leftFront);
  public WPI_TalonFX m_leftBack = new WPI_TalonFX(Constants.CAN.leftBack);
  public SpeedControllerGroup m_left = new SpeedControllerGroup(m_leftFront, m_leftBack);
  /* right motors */
  public WPI_VictorSPX m_rightFront = new WPI_VictorSPX(Constants.CAN.rightFront);
  public WPI_TalonFX m_rightBack = new WPI_TalonFX(Constants.CAN.rightBack);
  public SpeedControllerGroup m_right = new SpeedControllerGroup(m_rightFront, m_rightBack);
  /* differential drive */
  public DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

  public void arcadeDrive(Double speed, Double rotation){
    //clamp to between -1.0 and 1.0 for speed and rotation to prevent errors
    m_drive.arcadeDrive(speed, rotation);
  }
  
  /** Creates a new DriveTrain. */
  public DriveTrainSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
