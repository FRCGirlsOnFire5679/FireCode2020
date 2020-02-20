package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.*;
import frc.robot.commands.auto.*;
import frc.robot.profiling.PathFollower;
import frc.robot.profiling.PathTracking;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Robot extends TimedRobot {
    public static Gyro navxGyro;
    public static SwerveDrive swerve;
    public static PathTracking path;
    public static PathFollower follower;
    public static OI m_oi;
    public static NetworkTableInstance instance;
    public static NetworkTable visionNT;
    public static NetworkTableEntry yawRaw, yawDetected;
    public static double yaw;
    public static boolean tape;
    public static Command autoCommand;
    public static SendableChooser<Command> autoChooser;

    public void robotInit() {
        LiveWindow.disableAllTelemetry();
        navxGyro = new Gyro();
        swerve = new SwerveDrive();
        path = new PathTracking();
        follower = new PathFollower();
        m_oi = new OI();
        autoChooser = new SendableChooser<Command>();
        autoChooser.setDefaultOption("Driver Control", new DoNothing());
        autoChooser.addOption("Left 2 Rocket", new Left2Rocket());
        autoChooser.addOption("FL 2 Side Cargo", new Left2SideCargoShip());
        autoChooser.addOption("Right 2 Rocket", new Right2Rocket());
        autoChooser.addOption("Right 2 Rocket", new Left2SideCargoShip());
        SmartDashboard.putData("Autonomous Chooser", autoChooser);
    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
        visionNT = NetworkTableInstance.getDefault().getTable("ChickenVision");
        yawDetected = visionNT.getEntry("tapeDetected");
        tape = yawDetected.getBoolean(false);
        yawRaw = visionNT.getEntry("tapeYaw");
        yaw = yawRaw.getDouble(0);
        SmartDashboard.putNumber("yawval", yaw);
        SmartDashboard.putBoolean("tapeval", tape);
        swerve.smartDash();

        path.update();
    }

    @Override
    public void autonomousInit() {
        navxGyro.reset();
        autoCommand = (Command) autoChooser.getSelected();
        if (autoCommand != null) {
            autoCommand.cancel();
            autoCommand.start();
        }
    }

    @Override
    public void teleopInit() {
        swerve.setBrake();
        if (autoCommand != null) {
        autoCommand.cancel();
        }
    }

    @Override
    public void disabledInit() {
        swerve.setCoast();
        if (autoCommand != null) {
            autoCommand.cancel();
        }
    }
}