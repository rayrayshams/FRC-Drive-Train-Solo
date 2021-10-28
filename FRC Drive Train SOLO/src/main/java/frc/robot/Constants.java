// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class CAN{
        public final static int leftFront = 24;
        public final static int leftBack = 13;
        public final static int rightFront = 23;
        public final static int rightBack = 15;
    }
    public static class Shooter {
        public static final double kP = 0.004;
        public static final int kI = 0;
        public static final int kD = 0;
        public static final int kIz = 0;
        public static final double kFF = 0.000015;
        public static final int kMaxOutput = 1;
        public static final int kMinOutput = -1;
        public static final int maxRPM = 5700;
    }
}
