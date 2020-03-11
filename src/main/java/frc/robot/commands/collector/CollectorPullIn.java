package frc.robot.commands.collector;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class CollectorPullIn extends Command {
    public CollectorPullIn() {
        requires(Robot.collector);
    }

    @Override
    public void execute() {
        Robot.collector.pull(0.2); //TODO: determine speed of pull
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end() {
        Robot.collector.pull(0);
        // TODO: do we need to do anything here?
    }
}