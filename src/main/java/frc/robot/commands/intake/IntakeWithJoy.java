package frc.robot.commands.intake;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class IntakeWithJoy extends Command {
    
    public IntakeWithJoy() {
        requires(Robot.intake);
    }

    @Override
    public void execute() {
       double y = OI.joy2.getRawAxis(RobotMap.Controller.RY);
       //Robot.intake.joyControl(y);
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}