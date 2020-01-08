package frc.robot.commands.cargo;

import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class CargoWithJoy extends Command {
    
    public CargoWithJoy() {
        requires(Robot.cargo);
    }

    @Override
    public void execute() {
       double y = OI.joy2.getRawAxis(RobotMap.Controller.RY);
       Robot.cargo.joyControl(y);
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}