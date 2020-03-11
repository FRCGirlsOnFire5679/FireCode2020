package frc.robot.commands.collector;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class CollectorPushOut extends Command {
    public CollectorPushOut() {
        requires(Robot.collector);
    }

    @Override
    public void execute() {
        Robot.collector.push(2); //TODO: determine speed of pull
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end() {
        // TODO: do we need to do anything here?
    }
}