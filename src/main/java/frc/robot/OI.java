package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import frc.robot.util.buttons.*;
import frc.robot.commands.collector.*;
import frc.robot.commands.swerve.*;

public class OI {
    public static Joystick joy1 = new Joystick(0);
    Button lockSwerve = new EnabledButton(joy1, RobotMap.Controller.A);
    Button fieldOrient = new EnabledButton(joy1, RobotMap.Controller.RIGHT_BUMPER);
    Button gyroReset = new EnabledButton(joy1, RobotMap.Controller.LEFT_BUMPER);
    Button visionFoward = new JoystickAxisButton(joy1, RobotMap.Controller.LT);
    Button visionBack = new JoystickAxisButton(joy1, RobotMap.Controller.RT);
    Button slow = new EnabledButton(joy1, RobotMap.Controller.JOY_RIGHT);
    Button runWheels = new EnabledButton(joy1, RobotMap.Controller.JOY_LEFT);
    
    Button retract = new EnabledButton(joy1, RobotMap.Controller.B);

    
    public static Joystick joy2 = new Joystick(1);
    Button collectorIn = new EnabledButton(joy2, RobotMap.Controller.A);
    Button collectorOut = new EnabledButton(joy2, RobotMap.Controller.B);
    public OI() {
        slow.whileHeld(new SwerveSetLowSpeed());
        lockSwerve.whenPressed(new SwerveLock());
        fieldOrient.whenPressed(new SwerveSetField());
        gyroReset.whenPressed(new SwerveGyroReset());
        visionFoward.whileHeld(new SwerveDriveVisionForwards());
        visionBack.whileHeld(new SwerveDriveVisionReverse());
        collectorIn.whileHeld(new CollectorPullIn());
        collectorOut.whileHeld(new CollectorPushOut());
    }
}