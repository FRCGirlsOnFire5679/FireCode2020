package frc.robot;

public class RobotMap {
    public static class SwerveDrive {
        // These numbers control the Swerve PID
        // start with p, i, d at 0, and tune as needed
        // slowly work p value up until it oscillates about 3 times and then stops
        // Then mess with D and then set it to 1/10 of p value (ex: p = .75, d = .075)
        // changing weight will affect friction and therefore require more tuning

        // main one we'll touch, variable with how far you are from set point
        // farther you are from zero, the faster wheels will turn towards set point
        // (higher p value means faster, and too high and we'll ocilate)
        public static final double SWERVE_STEER_P = 0.75;

        // least used - frequently will be set to zero
        // in non-swerve, used when slightly off from set point
        // ramps up over time the longer you're not hitting set point
        public static final double SWERVE_STEER_I = 0;

        // trickiest - directly adjusts p value - if p value is saw wave, d makes it sin wave
        // control oscillations, keep from overshooting. If too high, it will keep you from
        // turning at all. This is the adjustment value after p to control oscillation
        public static final double SWERVE_STEER_D = .075;
        public static final double SWERVE_STEER_CAP = 1;

        // Swerve Motor Controller CAN ID's
        public static final int FL_DRIVE = 7;
        public static final int FR_DRIVE = 2;
        public static final int BL_DRIVE = 8;
        public static final int BR_DRIVE = 9;
        public static final int FL_STEER = 5;
        public static final int FR_STEER = 4;
        public static final int BL_STEER = 6;
        public static final int BR_STEER = 3;

        // Port which the steering encoders are plugged into
        public static final int FL_ENCODER = 0;
        public static final int FR_ENCODER = 1;
        public static final int BL_ENCODER = 2;
        public static final int BR_ENCODER = 3;
        
        //Encoder offsets for real robot
        public final static double BL_ENC_OFFSET = 248;
        public final static double BR_ENC_OFFSET = 189;
        public final static double FL_ENC_OFFSET = 177;
        public final static double FR_ENC_OFFSET = 112;

        public static final boolean ENCODERS_REVERSED = false;

        // Cad Wheel Base information for Aries
        public static final double WHEEL_BASE_LENGTH = 24.75;
        public static final double WHEEL_BASE_WIDTH = 12.75;

        public static final double SPEED = 50;
        public static final double TURN_RATE = 50;
    }

    public static class Controller {
        public final static int A = 1;
        public final static int B = 2;
        public final static int X = 3;
        public final static int Y = 4;
        public final static int LEFT_BUMPER = 5;
        public final static int RIGHT_BUMPER = 6;
        public final static int LEFT_FACE = 7;
        public final static int RIGHT_FACE = 8;
        public final static int JOY_LEFT = 9;
        public final static int JOY_RIGHT = 10;

        public final static int LX = 0;
        public final static int LY = 1;
        public final static int LT = 2;
        public final static int RT = 3;
        public final static int RX = 4;
        public final static int RY = 5;

        public final static int UP = 0;
        public final static int RIGHT = 90;
        public final static int DOWN = 180;
        public final static int LEFT = 270;

    }

    public static class CollectorMotor {
        public final static int C_MOTOR = 10; //TODO: Confirm this as correct
    }
 }