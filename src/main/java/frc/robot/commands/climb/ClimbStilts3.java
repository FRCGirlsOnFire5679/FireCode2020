package frc.robot.commands.climb;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClimbStilts3 extends Command {
    public ClimbStilts3() {
        requires(Robot.stilt);
    }

    @Override
    protected void initialize() {
        Robot.stilt.level3();  
    }
    @Override
    protected boolean isFinished() {
        return true;
    }
}
