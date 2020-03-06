package frc.robot.commands.cargo;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CargoLongExtend extends Command {

    public CargoLongExtend() {
        requires(Robot.intake);
    }

    @Override
    public void execute() {
        // if (Robot.elevator.clearForCargo() && !Robot.hatch.hatchExtended)
            Robot.intake.extendLong();
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}