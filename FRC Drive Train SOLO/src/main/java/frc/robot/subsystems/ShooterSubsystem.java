// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
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

  private WPI_TalonSRX m_belt_f = new WPI_TalonSRX(Constants.CAN.shooter_belt_front);
  private VictorSPX m_belt_b = new VictorSPX(Constants.CAN.shooter_belt_back);

  private NetworkTable m_table = NetworkTableInstance.getDefault().getTable("limelight");
  public NetworkTableEntry ta = m_table.getEntry("ta");

public class Robot extends TimedRobot {
  private Joystick m_stick;
  private static final int deviceID = 1;
  private CANSparkMax m_motor;
  private CANPIDController m_pidController;
  private CANEncoder m_encoder;
  public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput, maxRPM;
  m_motor.restoreFactoryDefaults();

  m_pidController.setP(kP);
  m_pidController.setI(kI);
  m_pidController.setD(kD);
  m_pidController.setIZone(kIz);
  m_pidController.setFF(kFF);
  m_pidController.setOutputRange(kMinOutput, kMaxOutput);

  m_pidController.setReference(setPoint, ControlType.kVelocity);
  

  }
}
