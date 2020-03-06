package frc.robot.commands.intake;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class IntakePowerCellIn extends Command {
    
    public double y;
    public IntakePowerCellIn() {
    }

    @Override
    public void execute() {
       y = OI.joy2.getRawAxis(RobotMap.Controller.A);
       Robot.intake.pull(y);
    }
    @Override
    public boolean isFinished() {
        return Math.abs(y)<0.1;
    }

    @Override
    public void end() {
        Robot.intake.pull(0);
    }

    @Override
    public void interrupted() {
        end();
    }
}