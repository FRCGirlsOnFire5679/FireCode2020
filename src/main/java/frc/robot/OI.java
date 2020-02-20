package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import frc.robot.util.buttons.*;

import frc.robot.commands.swerve.*;
import frc.robot.RobotMap;

public class OI {
    public static Joystick joy1 = new Joystick(0);
    Button lockSwerve = new EnabledButton(joy1, RobotMap.Controller.A);
    Button fieldOrient = new EnabledButton(joy1, RobotMap.Controller.RIGHT_BUMPER);
    Button gyroReset = new EnabledButton(joy1, RobotMap.Controller.LEFT_BUMPER);
    Button visionFoward = new JoystickAxisButton(joy1, RobotMap.Controller.LT);
    Button visionBack = new JoystickAxisButton(joy1, RobotMap.Controller.RT);
    Button slow = new EnabledButton(joy1, RobotMap.Controller.JOY_RIGHT);
    Button shortPiston = new EnabledButton(joy1, RobotMap.Controller.LEFT_FACE);
    Button stopArm = new EnabledButton(joy1, RobotMap.Controller.RIGHT_FACE);
    Button runWheels = new EnabledButton(joy1, RobotMap.Controller.JOY_LEFT);
    
    // Button prepare2 = new EnabledButton(joy1, RobotMap.Controller.RIGHT_FACE);
    Button prepare3 = new EnabledButton(joy1, RobotMap.Controller.X);
    
    
    public static Joystick joy2 = new Joystick(1);

    public OI() {
        slow.whileHeld(new SwerveSetLowSpeed());
        lockSwerve.whenPressed(new SwerveLock());
        fieldOrient.whenPressed(new SwerveSetField());
        gyroReset.whenPressed(new SwerveGyroReset());
        visionFoward.whileHeld(new SwerveDriveVisionForwards());
        visionBack.whileHeld(new SwerveDriveVisionReverse());
    }
}