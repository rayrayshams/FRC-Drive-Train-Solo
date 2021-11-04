// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ShooterSubsystem extends SubsystemBase {
  private CANSparkMax m_shooterMotor;
  private CANEncoder m_encoder;
  private CANPIDController m_controller;

  private PIDController m_pidController;

  private NetworkTable m_table = NetworkTableInstance.getDefault().getTable("limelight");
  public NetworkTableEntry ta = m_table.getEntry("ta");

public class Shooter {
  private Joystick m_stick;
  //private static final int deviceID = 1;
  private CANSparkMax m_motor;
  private CANPIDController m_controller;
  private PIDController m_pidController;
  private CANEncoder m_encoder;
  public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput, maxRPM;

public Shooter(){
  m_motor = new CANSparkMax(10, MotorType.kBrushless);
  m_controller.setP(kP);
  m_controller.setI(kI);
  m_controller.setD(kD);
  m_controller.setIZone(kIz);
  m_controller.setFF(kFF);
  m_controller.setOutputRange(kMinOutput, kMaxOutput);
  m_pidController = new PIDController(Constants.Shooter.kP, Constants.Shooter.kI, Constants.Shooter.kD);
  double setPoint = m_stick.getY()*maxRPM;
  m_controller.setReference(setPoint, ControlType.kVelocity);
  SmartDashboard.putNumber("SetPoint", setPoint);
  SmartDashboard.putNumber("ProcessVariable", m_encoder.getVelocity());
}
  }
 /**
   * Set Position of Shooter
   * 
   * @param velocity The desired velocity of the shooter
   */
  public void set(double current, double target) {
    m_shooterMotor.set(m_pidController.calculate(current, target) * 0.004);
    System.out.println(m_pidController.calculate(current, target) * 0.004);
  }

  /**
   * Stop Shooter
   */
  public void stop() {
    m_controller.setReference(0, ControlType.kDutyCycle);
    m_shooterMotor.stopMotor();
  }

}

